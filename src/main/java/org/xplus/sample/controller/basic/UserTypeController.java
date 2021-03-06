package org.xplus.sample.controller.basic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.xplus.sample.service.basic.UserTypeService;

@Controller
@RequestMapping("/basic")
public class UserTypeController {

	@Autowired
	UserTypeService userTypeService;
	
	@RequestMapping(value = "/userTypeLookup", method = RequestMethod.GET)
	@ResponseBody
	public List<?> restSexList() {
		return userTypeService.findAll();
	}
}
