package com.mvc.pack;

import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.pack.Contact;

@Controller
public class ValidateController {
	@RequestMapping(value="validate",method=RequestMethod.GET)
	public String Meth(@RequestParam("usr") String name,@RequestParam("pwd") String pass,Model m)
	{
		  if(name.equals("admin") && pass.equals("abc")){
			  m.addAttribute("N",name);
			  return "/success";
		  }else
			  return "/failure";
	
	}
	@RequestMapping("/Contacts")
	public String disp(Model m){
		m.addAttribute("contact",new Contact());
		return "/contactjsp";
	}
/*	@RequestMapping("/addcontact")
	public ModelAndView addContact(Model m,Contact contact1){
		m.addAttribute("f",contact1.getFname());
		m.addAttribute("l",contact1.getLname());
		m.addAttribute("p",contact1.getTelephone());
		m.addAttribute("e",contact1.getEmail());
		return new ModelAndView("/display");
	}*/
	@RequestMapping("/addcontact")
	public ModelAndView addContact(@ModelAttribute("contact1")Contact contact234){
		return new ModelAndView("/display");
	}
}
