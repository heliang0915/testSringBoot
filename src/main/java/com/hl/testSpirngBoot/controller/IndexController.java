package com.hl.testSpirngBoot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/json")
public class IndexController {
	@RequestMapping("")
	public String index() {
		 return "hello spring boot";
	}

}