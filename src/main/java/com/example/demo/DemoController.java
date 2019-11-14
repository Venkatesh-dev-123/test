package com.example.demo;

import org.jboss.logging.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	Logger logger=Logger.getLogger(GradleWebApplication.class);
	@RequestMapping("/welcome")
	public String welcome() {
		logger.info("we are in welcome");
		return "welcome to gradle application";
	}
	
	@RequestMapping("/bye")
	public String bye() {
		return "gdbye to gradle application";
	}
}
