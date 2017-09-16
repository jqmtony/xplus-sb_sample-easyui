package org.xplus.sample.controller.sample;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/sample/grid")
public class GridSampleController {

	@RequestMapping(value = "/sample1", method = RequestMethod.GET)
	public ModelAndView viewGrid1() {
		Map<String, Object> map = new HashMap<>();
		// ......
		return new ModelAndView("sample/grid_sample1", map);
	}

	@RequestMapping(value = "/sample1_data", method = RequestMethod.GET)
	@ResponseBody
	public Object restGridSampleData() {
		return null;
	}
}
