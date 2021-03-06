package org.xplus.sample.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView viewRoot() {
		Map<String, Object> map = new HashMap<>();
		// ......
		return new ModelAndView("index", map);
	}

	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public ModelAndView viewIndex() {
		Map<String, Object> map = new HashMap<>();
		// ......
		return new ModelAndView("index", map);
	}

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView viewLogin() {
		Map<String, Object> map = new HashMap<>();
		// ......
		return new ModelAndView("login", map);
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	@ResponseBody
	public Object restLoginValidation(@RequestParam(value = "username") String username,
			@RequestParam(value = "password") String passwrod) {

		// ......
		Map<String, Object> ret = new HashMap<>();
		ret.put("success", true);
		ret.put("message", "登录成功.");
		return ret;
	}

	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public ModelAndView viewHome() {
		Map<String, Object> map = new HashMap<>();
		// ......
		return new ModelAndView("home", map);
	}

}
