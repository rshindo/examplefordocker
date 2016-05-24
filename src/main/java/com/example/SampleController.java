package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author shindo
 *
 */
@Controller
@RequestMapping("sample")
public class SampleController {

	@RequestMapping(method=RequestMethod.GET, path="/")
	public ModelAndView index() {
		String os = System.getProperty("os.name");
		String arch = System.getProperty("os.arch");
		String version = System.getProperty("os.version");
		return new ModelAndView("index")
				.addObject("greeting", new Greeting("Hello!"))
				.addObject("os", os)
				.addObject("arch", arch)
				.addObject("version", version);
	}

}
