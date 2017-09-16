package org.xplus.sample.controller.system;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.xplus.sample.entity.system.User;
import org.xplus.sample.service.system.SexService;
import org.xplus.sample.service.system.UserService;
import org.xplus.sample.service.system.UserStatusService;
import org.xplus.sample.service.system.UserTypeService;
import org.xplus.sample.vo.system.UserVO;

/**
 * 用户管理<br>
 * 
 * @author qiming.kong
 *
 */
@Controller
@RequestMapping("/system")
public class UserController {

	@Autowired
	UserService userService;
	@Autowired
	UserTypeService userTypeService;
	@Autowired
	UserStatusService userStatusService;
	@Autowired
	SexService sexService;

	@RequestMapping(value = "/user", method = RequestMethod.GET)
	public ModelAndView viewUser() {
		Map<String, Object> map = new HashMap<>();
		// ......
		map.put("sexList", sexService.findAll());
		map.put("userTypeList", userTypeService.findAll());
		map.put("userStatusList", userStatusService.findAll());
		// ......
		return new ModelAndView("system/user", map);
	}

	@RequestMapping(value = "/userPages", method = RequestMethod.GET)
	@ResponseBody
	public Object restUserPages(@RequestParam(value = "page") int page, @RequestParam(value = "rows") int size,
			@RequestParam(value = "sort", required = false) List<String> sort,
			@RequestParam(value = "order", required = false) List<String> order,
			@RequestParam(value = "params", required = false) String params) throws Exception {

		return userService.findAll(page - 1, size, sort, order);
	}

	@RequestMapping(value = "/user.xml", method = RequestMethod.GET)
	@ResponseBody
	public Object restUserXml() {
		return null;
	}

	@RequestMapping(value = "/user", method = RequestMethod.POST)
	@ResponseBody
	public Object restUserCreate(UserVO vo) {
		return userService.save(vo);
	}

	@RequestMapping(value = "/user", method = RequestMethod.PUT)
	@ResponseBody
	public Object restUserUpdate(UserVO vo) {
		return userService.save(vo);
	}

	@RequestMapping(value = "/user/{id}", method = RequestMethod.DELETE)
	@ResponseBody
	public Object restUserDelete(@PathVariable String id) {
		return userService.delete(id);
	}

}
