package com.hl.testSpirngBoot.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/web")
public class WebController {
	@RequestMapping("")
	public String gotoIndex(Model model) {
		List<String> list=new ArrayList<String>();
		list.add("1");
		list.add("2");
		list.add("3");
		model.addAttribute("username","张三");
		model.addAttribute("nick","我是昵称");
		model.addAttribute("list",list);
		model.addAttribute("flag",false);
		model.addAttribute("flag",false);
		 return "/index/index";
	}

}
