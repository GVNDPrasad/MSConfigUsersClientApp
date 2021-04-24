package com.ms.configclient.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserConfigController {

	private static final Logger log = LoggerFactory.getLogger(UserConfigController.class);

	@Value("${my.configapp.title}")
	private String title;

	@GetMapping("/show")
	public String show() {
		log.info("Entered UserConfigController :: show()");
		return "Config Value = "+title;
	}

}
