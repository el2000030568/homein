package com.klu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.klu.model.PersonManger;

@RestController
@RequestMapping("/person")
public class UserController {

	@Autowired
	PersonManger pm;
	
	@GetMapping("/login/{pass}/{name}")
	public String getlogin(@PathVariable("pass") int password,@PathVariable("name") String name)
	{
		String check = pm.getname(password, name);
		if(check!=null)
			return "home.jsp";
		else
			return "error.jsp";
	}
	
}
