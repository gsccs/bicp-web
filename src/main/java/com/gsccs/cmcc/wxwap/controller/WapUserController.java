package com.gsccs.cmcc.wxwap.controller;

import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.gsccs.plat.auth.model.Authorization;
import com.gsccs.plat.auth.model.User;
import com.gsccs.plat.auth.service.AuthService;
import com.gsccs.plat.auth.service.UserService;
import com.gsccs.plat.bass.JsonMsg;

/**
 * 微信用户绑定
 * 
 * @author x.d zhang
 * @version 1.0
 * 
 */
@Controller
@RequestMapping("/web/{appid}")
public class WapUserController extends WapMpController{
	
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private UserService userService;
	@Autowired
	private AuthService authService;
	
	/**
	 * 会员微信中心
	 * @param openid
	 * @param userid
	 * @param roleid
	 * @param response
	 * @return
	 */
    @RequestMapping(value="/wxUserView", method = RequestMethod.GET)
    public String wxUserView(
    		@PathVariable("appid") String appid,
    		@RequestParam(value = "openid") String openid,
    		@RequestParam(value="code") String code,
    		ModelMap map) {
    	this.logger.info("\n接收到参数：[{}, {}, {}]",appid, openid, code);
    	
    	//判断是否带参数
    	if(StringUtils.isEmpty(openid)){
			openid = getOpenid(appid,code);
		}
    	//保存用户信息
    	User user = userService.synWxMpUser(appid,openid);
    	if (null==user){
    		return "redirect:/web/"+appid+"/wxUserView"; 
    	}
    	//未绑定 需要跳转绑定页面
    	if (StringUtils.isEmpty(user.getRealname()) || StringUtils.isEmpty(user.getPhone())){
    		map.put("appid", appid);
        	map.put("openid", openid);
    		return "wxwap/user_bind";
    	}
    	map.put("appid", appid);
    	map.put("openid", openid);
    	map.put("wxUser", user);
    	return "wxwap/user_view";
    }
	
	
	/**
	 * 会员微信绑定页面
	 * 
	 * @param map
	 * @return
	 */
	@RequestMapping(value = "/wxUserBind", method = RequestMethod.GET)
	public String wxUserBind(
			@PathVariable("appid") String appid,
			@RequestParam(value="openid") String openid,
			@RequestParam(value="code") String code,ModelMap map) {
		if(StringUtils.isEmpty(openid)){
			openid = getOpenid(appid,code);
		}
		map.put("appid", appid);
		map.put("openid", openid);
		return "wxwap/user_bind";
	}
	
	
	
	/**
	 * 会员微信绑定
	 * @param openid
	 * @param userid
	 * @param roleid
	 * @param response
	 * @return
	 */
	@ResponseBody
    @RequestMapping(value="/wxUserBindP", method = RequestMethod.POST)
    public JsonMsg wxUserBind(
    		@PathVariable("appid") String appid,
    		@RequestParam(value = "openid") String openid,
    		@RequestParam(value = "realname") String realname,
    		@RequestParam(value = "phone") String phone,
            @RequestParam(value = "roleid") String roleid) {
		JsonMsg jsonMsg = new JsonMsg();
    	this.logger.info("\n接收到来自微信服务器的认证消息：[{}, {}, {}]",appid, openid, roleid);
    	User user = userService.findByOpenid(openid);
    	if (null != user && null != roleid){
    		user.setRealname(realname);
    		user.setPhone(phone);
    		userService.updateUser(user);
    		
    		Authorization auth = new Authorization();
    		auth.setAppId(1l);
    		auth.setUserId(user.getId());
    		auth.setRoleIds(roleid);
    		authService.setAuth(auth);
    	}
    	jsonMsg.setSuccess(true);
		return jsonMsg;
    }

	
}
