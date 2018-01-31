package com.gsccs.plat.auth.shiro;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.web.filter.PathMatchingFilter;
import org.springframework.beans.factory.annotation.Autowired;

import com.gsccs.plat.auth.service.UserService;
import com.gsccs.plat.bass.Constants;

/**
 * 系统用户过滤器
 * @author x.d zhang
 *
 */
public class SysUserFilter extends PathMatchingFilter {

	@Autowired
	private UserService userService;
	
	@Override
	protected boolean onPreHandle(ServletRequest request,
			ServletResponse response, Object mappedValue) throws Exception {
		String username = (String) SecurityUtils.getSubject().getPrincipal();
		request.setAttribute(Constants.CURRENT_USER,
				userService.findByAccount(username));
		return true;
	}
}
