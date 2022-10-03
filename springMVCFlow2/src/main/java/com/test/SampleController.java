package com.test;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SampleController {
	
	@RequestMapping("/orders")
	public String getOrders(ModelMap map) {
		
		map.addAttribute("orderId", "Order-101");
		map.addAttribute("orderDetails","Pen");
		map.addAttribute("customerId","RP3444");
		
		return "orders";
	}
	
	@RequestMapping("/products")
	public String getProducts(Model model) {
		
		model.addAttribute("productId", "P299");
		model.addAttribute("productName", "Book");
		model.addAttribute("cost", "398");
		
		return "products";
	}
}
