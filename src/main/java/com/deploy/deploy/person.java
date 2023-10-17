package com.deploy.deploy;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class person {
	@RequestMapping("/")
	public String getname() {
		return "shrijeet";
	}
}
