package com.gsccs.cmcc.wxwap.controller;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.gsccs.cmcc.wxmp.model.WxApp;

/**
 * 微信前端应用
 * 
 * @author x.d zhang
 * @version 1.0
 * 
 */
@Controller
@RequestMapping("/web/{appid}")
public class WapTaskController extends WapMpController{
	
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	/**
	 * 合同列表
	 * 
	 * @param map
	 * @return
	 */
	@RequestMapping(value = "/projects", method = RequestMethod.GET)
	public String projectList(
			@PathVariable("appid") String appid,
			@RequestParam(defaultValue = "") String openid,
			@RequestParam(defaultValue = "") String code,
			@RequestParam(defaultValue = "1") int currPage,
			@RequestParam(defaultValue = "10") int pageSize,
			@RequestParam(defaultValue = "") String order, ModelMap map) {
		//1、判断当前openid是否存在，
		if(StringUtils.isEmpty(openid)){
			openid = getOpenid(appid,code);
		}
		List<WxApp> wxAppList = wxAppService.find(null, order, currPage,
				pageSize, false);
		map.put("list", wxAppList);
		return "wxwap/project_list";
	}
	
	
	/**
	 * 任务节点列表
	 * 
	 * @param map
	 * @return
	 */
	@RequestMapping(value = "/project-{id}", method = RequestMethod.GET)
	public String taskList(@PathVariable("id") String id,
			@RequestParam(defaultValue = "1") int currPage,
			@RequestParam(defaultValue = "10") int pageSize,
			@RequestParam(defaultValue = "") String order, ModelMap map) {
		List<WxApp> wxAppList = wxAppService.find(null, order, currPage,
				pageSize, false);
		map.put("list", wxAppList);
		return "wxwap/task_list";
	}
	
	
	/**
	 * 查询节点详情
	 * 
	 * @param map
	 * @return
	 */
	@RequestMapping(value = "/task-{id}", method = RequestMethod.GET)
	public String taskDetail(@PathVariable("id") String id,
			@RequestParam(defaultValue = "") String openid,ModelMap map) {
		
		return "wxwap/task_form";
	}
	
	/**
	 * 项目评价表单
	 * @param id
	 * @param openid
	 * @param map
	 * @return
	 */
	@RequestMapping(value = "/eval-{id}", method = RequestMethod.GET)
	public String projectEval(@PathVariable("id") String id,
			@RequestParam(value = "openid", required = false) String openid,ModelMap map) {
		
		return "wxwap/project_eval";
	}
	
	
	/**
	 * 项目评价
	 * @param openid
	 * @param remark
	 * @param nonce
	 * @param response
	 * @return
	 */
	@ResponseBody
    @RequestMapping(value="/eval", method = RequestMethod.POST)
    public String projectEval(
    		@RequestParam(value = "openid", required = false) String openid,
            @RequestParam(value = "remark", required = false) String remark,
            @RequestParam(value = "nonce", required = false) String nonce,
            HttpServletResponse response) {
    	this.logger.info("\n接收到来自微信服务器的认证消息：[{}, {}, {}]", openid, remark, nonce);
		
		return "非法请求";
    }

	
}
