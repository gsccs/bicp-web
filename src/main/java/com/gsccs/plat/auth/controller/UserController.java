package com.gsccs.plat.auth.controller;

import java.util.List;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang.StringUtils;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.alibaba.fastjson.JSON;
import com.gsccs.plat.auth.model.Authorization;
import com.gsccs.plat.auth.model.User;
import com.gsccs.plat.auth.service.AuthService;
import com.gsccs.plat.auth.service.OrganizationService;
import com.gsccs.plat.auth.service.UserService;
import com.gsccs.plat.bass.Constants;
import com.gsccs.plat.bass.Datagrid;
import com.gsccs.plat.bass.JsonMsg;

/**
 * 系统用户管理
 */
@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;
	@Autowired
	private AuthService authService;
	@Autowired
	private OrganizationService organizationService;

	@RequiresPermissions("user:view")
	@RequestMapping(method = RequestMethod.GET)
	public String list(Model model) {
		return "auth/user-list";
	}

	@RequiresPermissions("user:view")
	@RequestMapping(value = "/datagrid", method = RequestMethod.POST)
	@ResponseBody
	public Datagrid userList(User user,
			@RequestParam(defaultValue = "") String order,
			@RequestParam(defaultValue = "1") int page,
			@RequestParam(defaultValue = "20") int rows,  ModelMap map,
			HttpServletRequest request) {
		Datagrid datagrid = new Datagrid();
		List<User> userList = userService
				.find(user, order, page, rows);
		int count = userService.count(user);
		datagrid.setRows(userList);
		datagrid.setTotal(Long.valueOf(count));
		return datagrid;
	}

	@RequiresPermissions("user:view")
	@RequestMapping(value = "/dataform", method = RequestMethod.GET)
	public String dataform(Long id, Model model) {
		setCommonData(model);
		if (null != id) {
			model.addAttribute("opt", "update");
			model.addAttribute("userInfo", userService.find(id));
		} else {
			model.addAttribute("opt", "create");
		}
		return "auth/user-edit";
	}

	@RequiresPermissions("user:create")
	@RequestMapping(value = "/create", method = RequestMethod.POST)
	@ResponseBody
	public JsonMsg create(User user, RedirectAttributes redirectAttributes) {
		JsonMsg json = new JsonMsg();
		
		if (null == user || StringUtils.isEmpty(user.getAccount())
				|| StringUtils.isEmpty(user.getPassword())) {
			json.setSuccess(false);
			json.setMsg("用户信息不完整！");
			return json;
		}
		
		User user_ = userService.findByAccount(user.getAccount());
		if (null != user_) {
			json.setSuccess(false);
			json.setMsg("登录帐号重复！");
			return json;
		}
		
		userService.createUser(user);
		json.setSuccess(true);
		json.setMsg("用户新增成功!");
		return json;
	}

	@RequiresPermissions("user:update")
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	@ResponseBody
	public JsonMsg update(User user, RedirectAttributes redirectAttributes) {
		JsonMsg json = new JsonMsg();
		if (null != user) {
			userService.updateUser(user);
		}
		json.setSuccess(true);
		json.setMsg("用户信息更新成功!");
		return json;
	}

	@RequiresPermissions("user:delete")
	@RequestMapping(value = "/delete", method = RequestMethod.POST)
	@ResponseBody
	public JsonMsg delete(Long id, RedirectAttributes redirectAttributes) {
		JsonMsg json = new JsonMsg();
		User user = userService.find(id);
		if (null != user){
			if (user.getAccount().equals("admin")){
				json.setSuccess(false);
				json.setMsg("删除失败：管理员帐户不允许删除！");
				return json;
			}
			userService.deleteUser(id);
			json.setSuccess(true);
			json.setMsg("用户删除成功!");
		}else{
			json.setSuccess(false);
			json.setMsg("删除失败：用户不存在！");
		}
		return json;
	}

	@RequiresPermissions("user:update")
	@RequestMapping(value = "/changepwd", method = RequestMethod.GET)
	public String showChangePasswordForm(Long id, Model model) {
		model.addAttribute("userInfo", userService.find(id));
		return "auth/user-pwd";
	}

	@RequiresPermissions("user:update")
	@RequestMapping(value = "/changepwd", method = RequestMethod.POST)
	@ResponseBody
	public JsonMsg changePassword(Long id, String newPassword,
			RedirectAttributes redirectAttributes) {
		JsonMsg json = new JsonMsg();
		userService.changePassword(id, newPassword);
		json.setSuccess(true);
		json.setMsg("用户密码修改成功!");
		return json;
	}
	
	@RequiresPermissions("user:update")
	@RequestMapping(value = "/changepwd1", method = RequestMethod.POST)
	@ResponseBody
	public void changePassword1(Long id, String newPassword,
			RedirectAttributes redirectAttributes) {
		JsonMsg json = new JsonMsg();
		userService.changePassword(id, newPassword);
		/*json.setSuccess(true);
		json.setMsg("用户密码修改成功!");
		return json;*/
	}
	

	@RequiresPermissions("user:view")
	@RequestMapping(value = "/authform", method = RequestMethod.GET)
	public String authform(Long id, Model model) {
		setCommonData(model);
		if (null != id) {
			User userobj = userService.find(id);
			Set<String> roleids = authService.findRoles(
					Constants.SERVER_APP_KEY, userobj.getAccount());
			model.addAttribute("user", userobj);
			model.addAttribute("roleids", JSON.toJSON(roleids));
		}
		return "auth/user-auth";
	}
	
	
	
	@RequestMapping(value = "/userroles", method = RequestMethod.POST)
	@ResponseBody
	public Set<String> userroles(Long userid, Model model) {
		Set<String> roleids = null;
		if (null != userid) {
			User userobj = userService.find(userid);
			roleids = authService.findRoles(
					Constants.SERVER_APP_KEY, userobj.getAccount());
		}
		
		return roleids;
	}

	
	@RequiresPermissions("user:view")
	@RequestMapping(value = "/userauth", method = RequestMethod.POST)
	@ResponseBody
	public JsonMsg userauth(Long userid, String roleids, Model model) {
		JsonMsg json = new JsonMsg();
		if (null != userid) {
			Authorization authorization = new Authorization();
			authorization.setUserId(userid);
			authorization.setAppId(1l);
			authorization.setRoleIds(roleids);
			System.out.println("roleids:"+roleids);
			authService.updateAuthorization(authorization);
			json.setSuccess(true);
			json.setMsg("授权成功！");
			return json;
		}
		json.setSuccess(false);
		json.setMsg("授权失败！");
		return json;
	}

	
	/**
	 * 同步微信用户
	 * @param appid
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/wxMpUserSyn", method = RequestMethod.POST)
	@ResponseBody
	public JsonMsg wxMpUserSyn(String appid,Model model) {
		JsonMsg json = new JsonMsg();
		if (StringUtils.isNotEmpty(appid)) {
			userService.synWxMpUserList(appid);
			json.setSuccess(true);
			json.setMsg("同步成功！");
			return json;
		}
		json.setSuccess(false);
		json.setMsg("同步失败！");
		return json;
	}
	
	
	/**
	 * 微信用户绑定
	 * @param appid
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/wxMpUserBind", method = RequestMethod.POST)
	@ResponseBody
	public JsonMsg wxMpUserBind(String appid,Model model) {
		JsonMsg json = new JsonMsg();
		if (StringUtils.isNotEmpty(appid)) {
			userService.synWxMpUserList(appid);
			json.setSuccess(true);
			json.setMsg("同步成功！");
			return json;
		}
		json.setSuccess(false);
		json.setMsg("同步失败！");
		return json;
	}
	
	
	private void setCommonData(Model model) {
		model.addAttribute("orgList", organizationService.findAll());
	}
}
