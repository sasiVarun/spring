package com.test;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AppController {

	@RequestMapping("/show")
	public String getDetails(Model model) {
		
		model.addAttribute("customerName", "sasi");
		model.addAttribute("customerID", "c100");
		model.addAttribute("address", "3-4/56 ABC Nagar");
		
		return "details";
	}
	
	@RequestMapping("/show1")
	public String getCustomers(ModelMap modelMap) {
		Customer customer = new Customer();
		customer.setCustomerName("Nivin");
		customer.setCustomerId("C100");
		customer.setAddress("ABC Nagar");
		modelMap.addAttribute("customerName", customer.getCustomerName());
		modelMap.addAttribute("customerId", customer.getCustomerId());
		modelMap.addAttribute("address", customer.getAddress());
		
		return "customer";
	}
	
	@RequestMapping("/show2")
	public ModelAndView getListOfCustomers() {
		ModelAndView mav = new ModelAndView("listCustomers");
		
		List<Customer> customers = new ArrayList<>();
		
		for (int i = 1; i < 10; i++) {
			 Customer customer = new Customer();
			 customer.setCustomerName("Name"+i);
			 customer.setCustomerId("ID"+i);
			 customer.setAddress("Address"+i);
			 customers.add(customer);
		}
		mav.addObject("customersAttribute", customers);
		return mav;
	}
	
	@ModelAttribute
	public void getCities(Model model) {
		List<String> cities = new ArrayList<String>();
		
		cities.add("Hyderabad");
		cities.add("Delhi");
		cities.add("Mumbai");
		cities.add("Kochi");
		cities.add("Chennai");
		
		model.addAttribute("citiesAttribute", cities);
	}
}
