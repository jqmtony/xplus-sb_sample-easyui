package org.xplus.sample.controller.system;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.xplus.sample.service.system.SexService;

@Controller
@RequestMapping("/system")
public class SexController {
	
	@Autowired
	SexService sexService;

	@RequestMapping(value = "/sexLookup", method = RequestMethod.GET)
	@ResponseBody
	public List<?> restSexList() {
		return sexService.findAll();
	}
}
