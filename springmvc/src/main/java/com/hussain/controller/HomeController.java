package com.hussain.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.ui.Model;

@Controller
public class HomeController {
    @RequestMapping(path="/", method=RequestMethod.GET)
    public String home(Model model) {
        System.out.println("This is Home Controller");
        model.addAttribute("name", "Shahid Hussain");
        model.addAttribute("id", 786);
        List<String> friends = new ArrayList<String>();
        friends.add("Aftab Alam");
        friends.add("Arslan Siddique");
        friends.add("Ansh Yadav");
        model.addAttribute("dost", friends);
        return "index";
    }
    
    @RequestMapping("/about")
    public String about() {
        System.out.println("This is About Controller");
        return "about";
    }
   //Passing the data to help.jsp page by the help of ModelAndView
    @RequestMapping("/help")
    public ModelAndView help() {
    	System.out.println("This is Help Controller");
    	
    	//Creating Model And View Object
    	ModelAndView modelAndView=new ModelAndView();
    	
    	//Setting the data
    	modelAndView.addObject("name","Khushbu Khatun");
    	modelAndView.addObject("roll_no",256);
    	modelAndView.addObject("student","Shahid");
    	//LocalDateTime now=LocalDateTime.now();
    	//modelAndView.addObject("time",now);
    	//Marks 
    	List<Integer> list=new ArrayList<>();
    	list.add(56);
    	list.add(60);
    	list.add(70);
    	modelAndView.addObject("marks",list);
    	//Setting the view mean On which page you want to display the data
    	modelAndView.setViewName("help");
    	System.out.println("This is Help in controller:");
    	
    	return modelAndView;
    }
}
