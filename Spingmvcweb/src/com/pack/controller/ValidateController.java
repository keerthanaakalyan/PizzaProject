package com.pack.controller;

import java.util.HashMap;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import com.pack.Contact;

import com.pizza.bean.Customer;
import com.pizza.bean.PizzaOrder;
import com.pizza.exception.NoOrderId;
import com.pizza.exception.PizzaException;
import com.pizza.service.PizzaOrderService;
import com.pizza.util.Topping;

@SuppressWarnings("unused")
@Controller
public class ValidateController {
	@Autowired
	private PizzaOrderService pizzaservice;
	
	@RequestMapping("/UtilController")
	public String insert(Model m){
		 HashMap<String,Integer> hm=new  HashMap<String,Integer>();
		 hm=Topping.ToppingRate();
         m.addAttribute("pizzatoppings",hm);
         m.addAttribute("cust",new Customer() );
		 return "/PlaceOrder";
	}
	@RequestMapping("/PlaceController")
	public String inserting(@RequestParam("pizza")int topping,@Valid @ModelAttribute("cust")Customer cust,BindingResult result){
	  
		if(result.hasErrors()){
			 
			  return "/Home";
		  }else{
			  PizzaOrder pizzaorder=new PizzaOrder();
			  int r=pizzaservice.placeOrder(cust,pizzaorder,topping);
			  if(r!=0)
			  return "/success";
			  else
				  return "/failure";
		  }
	}
	@RequestMapping("/delemp")
	public String disp1(Model m){
		//m.addAttribute("user",new Login());
		return "/delete";
	}
	@RequestMapping(value="/empdelete",method=RequestMethod.POST)
	public ModelAndView Meth1(@RequestParam("oid")int id,Model m)
	{   
		//PizzaOrder pizzaorder=pizzaservice.getOrderDetails(id);
		Customer cust=pizzaservice.getCustomerDetails(id);
		m.addAttribute("customer",cust);
		PizzaOrder pizzaorder = null;
		try {
			pizzaorder = pizzaservice.getOrderDetails(id);
		} catch (PizzaException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		m.addAttribute("pizzaorder", pizzaorder);
		return new ModelAndView("/deldisplay");    
	}
	@RequestMapping(value="/deleting",method=RequestMethod.POST)
	public ModelAndView Meth2(@ModelAttribute("pizzaorder")PizzaOrder cust,Model m)
	{   
		int r = 0;
		try {
			r = pizzaservice.deleteOrder(cust);
		} catch (NoOrderId e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Customer cust=pizzaservice.getCustomerDetails(id);
		
		if(r!=0)
			return new ModelAndView("/success");
			 else
				 return new ModelAndView("/failure");
		  
	}
	@RequestMapping("/display")
	public String display(Model m){
		//m.addAttribute("user",new Login());
		return "/displaydetails";
	}
	@RequestMapping(value="/getOrder",method=RequestMethod.POST)
	public String get(@RequestParam("oid")int id,Model m){
		try {
			 PizzaOrder pizzaorder=pizzaservice.getOrderDetails(id);
			m.addAttribute("list", pizzaorder);
			//System.out.println(pizzaorder.getCustomerId());
		} catch (PizzaException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "/displaypizza";
	}
	@RequestMapping("/displaycust")
	public String displaycust(Model m){
		//m.addAttribute("user",new Login());
		return "/displaycustdetails";
	}
	@RequestMapping(value="/getCust",method=RequestMethod.POST)
	public String getcust(@RequestParam("cid")int id,Model m){
		
			Customer cust=pizzaservice.getCustomerDetails(id);
			System.out.println(cust.getCustId());
			m.addAttribute("customer",cust);
		
		return "/displaycust";
	}
	@RequestMapping("/updateorder")
	public String Update(Model m){
		
		//m.addAttribute("employee",new Employee());
		return "/update";
	}
	@RequestMapping("/dispcustomer")
	public String dispup(@RequestParam("oid")int id,Model m){
		
		Customer cust=null;
		
			//pizzaorder = pizzaservice.getOrderDetails(id);
			 cust=pizzaservice.getCustomerDetails(id);
		
		//m.addAttribute("pizza",pizzaorder);
		m.addAttribute("cust", cust);
		return "/dispup";
	}
	@RequestMapping("/upemp")
	public ModelAndView UpdateEmployee(@ModelAttribute("cust")Customer c){
		System.out.println();
		int r = 0;
		try {
			r = pizzaservice.updateOrder(c);
		} catch (NoOrderId e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 if(r!=0)
		return new ModelAndView("/updsuccess");
		 else
			 return new ModelAndView("/failure");
	}
	@RequestMapping("/Exit")
	public String exit(Model m){
		
		//m.addAttribute("employee",new Employee());
		return "/Exit";
	}
}
