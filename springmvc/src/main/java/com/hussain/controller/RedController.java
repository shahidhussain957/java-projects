package com.hussain.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RedController {
@RequestMapping("/one")
public String one() {
	System.out.println("This is one handler");
	return "";
}
/*
 //Redirecting by RedirectView
  @RequestMapping("/one")
  public RedirectView one()
{ 
 System.out.println("This is one");
 RedirectView redirectview=new RedirectView();
 redirectView.setUrl("two");
 return redirectView;
 }
  */
@RequestMapping("/two")
public String two() {
	System.out.println("This is Two handler");
	return "ContactForm";
}
}
