package org.xplus.sample.controller.system;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.xplus.sample.service.system.RoleService;

/**
 * 角色管理<br>
 * 
 * @author qiming.kong
 *
 */
@Controller
@RequestMapping("/system")
public class RoleController {

	@Autowired
	RoleService roleService;

	@RequestMapping(value = "/role", method = RequestMethod.GET)
	public ModelAndView viewRole() throws Exception {
		Map<String, Object> map = new HashMap<>();
		return new ModelAndView("/system/role", map);
	}

	@RequestMapping(value = "/rolePages", method = RequestMethod.GET)
	@ResponseBody
	public Object restRolePages(@RequestParam(value = "page") int page, @RequestParam(value = "rows") int size,
			@RequestParam(value = "sort", required = false) List<String> sort,
			@RequestParam(value = "order", required = false) List<String> order,
			@RequestParam(value = "params", required = false) String params) throws Exception {
		
		
		return null;
	}

}
