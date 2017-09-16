package org.xplus.sample.controller.sample;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/sample/form")
public class FormSampleController {

	@RequestMapping(value = "/sample1", method = RequestMethod.GET)
	public ModelAndView viewForm1() {
		Map<String, Object> map = new HashMap<>();
		// ......
		return new ModelAndView("sample/form_sample1", map);
	}

	@RequestMapping(value = "/sample1_data", method = RequestMethod.GET)
	@ResponseBody
	public Object restFormSampleData() {
		return null;
	}
}
