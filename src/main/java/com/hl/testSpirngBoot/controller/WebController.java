package com.hl.testSpirngBoot.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hl.testSpirngBoot.dao.UserDao;
import com.hl.testSpirngBoot.domain.User;

@Controller
@RequestMapping("/web")
public class WebController {

	@Autowired
	private UserDao dao;

	@RequestMapping("")
	public String gotoIndex(Model model) {
		List<String> list = new ArrayList<String>();
		list.add("1");
		list.add("2");
		list.add("3");
		model.addAttribute("username", "张三");
		model.addAttribute("nick", "我是昵称");
		model.addAttribute("list", list);
		model.addAttribute("flag", false);
		model.addAttribute("sex", 0);
		User user=new User();
		user.setPassword("123456");
		user.setUserName("张三");
//		dao.save(user);
		List<User> users=dao.findAll();
//		System.out.println("users:::"+users.size());
		model.addAttribute("users", users);
		return "/index/index";
	}

}
