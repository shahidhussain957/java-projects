package com.hussain.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.hussain.service.UserService;

@Controller
public class FormController {
	@Autowired
	private UserService userService;
	
@RequestMapping("/Contact")
public String ShowForm(Model model) {
	model.addAttribute("Header","Learningcodewith Durgesh");
	return"ContactForm";
}


@RequestMapping(path="processform",method=RequestMethod.POST)
//Handling Form with help of @ModelAttribute
public String HandleForm(@ModelAttribute User user, Model model) {
	
	System.out.println(user);
	if (user.getUsername().isBlank()) {
	    return "redirect:/Contact";
	}

	this.userService.createUser(user);
	model.addAttribute("msg","Registration successfully");
	//this will show user id after registration
//	int createdUser=this.userService.createUser(user);
//	model.addAttribute("msg","User created with Id:"+createdUser);
	return "success";
	
}

}











//Handling form with help of @RequestParam attribut
/*@RequestMapping(path="processform",method=RequestMethod.POST)
public String HandleForm(
		@RequestParam("email")String Useremail,
		@RequestParam("username")String name,
		@RequestParam("password")String password,Model model) {
	System.out.println("User Email is:"+Useremail);
	System.out.println("User name is:"+name);
	System.out.println("user password is:"+password);
	
	//Process
	model.addAttribute("email",Useremail);
	model.addAttribute("name",name);
	model.addAttribute("password",password);
	return "success";
	
}*/
