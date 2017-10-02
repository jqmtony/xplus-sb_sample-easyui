package org.xplus.sample.commons.shiro;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.session.Session;
import org.xplus.sample.dto.UserDTO;

public class SessionUtil {

	/**
	 * 用户信息key
	 */
	public static final String USER_SESSION_KEY = "USER_SESSION_KEY";
	public static final String USER_SESSION_LOGOUT_LOGOUT_KEY = "USER_SESSION_LOGOUT_LOGOUT_KEY";

	/**
	 * 从session中获取当前登录的用户信息
	 * 
	 * @return[参数、异常说明] @return UserForm [返回类型说明]
	 * @see [类、类#方法、类#成员]
	 */
	public static UserDTO getSession() {
		Session session = SecurityUtils.getSubject().getSession();
		return (UserDTO) session.getAttribute(USER_SESSION_KEY);
	}

	public static void setSession(UserDTO dto) {
		Session session = SecurityUtils.getSubject().getSession();
		session.setAttribute(USER_SESSION_KEY, dto);
	}
}
