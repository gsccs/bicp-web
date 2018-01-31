package com.gsccs.plat.auth.shiro;

import java.io.PrintWriter;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.web.filter.authc.FormAuthenticationFilter;
import org.apache.shiro.web.util.SavedRequest;
import org.apache.shiro.web.util.WebUtils;
import org.springframework.util.StringUtils;

import com.alibaba.fastjson.JSONObject;

/**
 * <p>User: x.d zhang
 * <p>Date: 14-3-16
 * <p>Version: 1.0
 */
public class ServerFormAuthenticationFilter extends FormAuthenticationFilter {
	
	@Override
	protected boolean isAccessAllowed(ServletRequest request,
			ServletResponse response, Object mappedValue) {
		Subject subject = getSubject(request, response);
		return subject.isAuthenticated();
	}
	
	

	@Override
	protected boolean onAccessDenied(ServletRequest request,
			ServletResponse response) throws Exception {
		String backUrl = request.getParameter("backUrl");
		System.out.println("backUrl:" + backUrl);

		// 非ajax请求,重定向到登录页面
		if (!"XMLHttpRequest".equalsIgnoreCase(((HttpServletRequest) request)
				.getHeader("X-Requested-With"))) {
			System.out.println("非ajax请求");
			saveRequestAndRedirectToLogin(request, response);
			/*saveRequest(request, backUrl,
					getDefaultBackUrl(WebUtils.toHttp(request)));
			redirectToLogin(request, response);*/
		} else {// ajax请求
			System.out.println("ajax请求");
			JSONObject json = new JSONObject();
			response.setCharacterEncoding("UTF-8");
			PrintWriter out = response.getWriter();
			out.write(json.toJSONString());
			out.println("{message:'login'}");
			out.flush();
			out.close();
		}
		return false;
	}

	protected void saveRequest(ServletRequest request, String backUrl,
			String fallbackUrl) {
		Subject subject = SecurityUtils.getSubject();
		Session session = subject.getSession();
		HttpServletRequest httpRequest = WebUtils.toHttp(request);
		session.setAttribute("authc.fallbackUrl", fallbackUrl);
		SavedRequest savedRequest = new ClientSavedRequest(httpRequest, backUrl);
		session.setAttribute(WebUtils.SAVED_REQUEST_KEY, savedRequest);
	}

	private String getDefaultBackUrl(HttpServletRequest request) {
		String scheme = request.getScheme();
		String domain = request.getServerName();
		int port = request.getServerPort();
		String contextPath = request.getContextPath();
		StringBuilder backUrl = new StringBuilder(scheme);
		backUrl.append("://");
		backUrl.append(domain);
		if ("http".equalsIgnoreCase(scheme) && port != 80) {
			backUrl.append(":").append(String.valueOf(port));
		} else if ("https".equalsIgnoreCase(scheme) && port != 443) {
			backUrl.append(":").append(String.valueOf(port));
		}
		backUrl.append(contextPath);
		backUrl.append(getSuccessUrl());
		return backUrl.toString();
	}
	
    protected void issueSuccessRedirect(ServletRequest request, ServletResponse response) throws Exception {
        String fallbackUrl = (String) getSubject(request, response)
                .getSession().getAttribute("authc.fallbackUrl");
        if(StringUtils.isEmpty(fallbackUrl)) {
            fallbackUrl = getSuccessUrl();
        }
        WebUtils.redirectToSavedRequest(request, response, fallbackUrl);
    }

}
