package com.deloitte.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.deloitte.pojo.Product;


@Controller
public class ProductController {
	
	@RequestMapping(value = "/product", method = RequestMethod.GET)
	public ModelAndView product() {
		Product product = new Product();
		product.setId(10);
		product.setName("Pen");
		product.setPrice(10.0);
		return new ModelAndView("product", "command", product);

	}

	@RequestMapping(value = "/addProduct", method = RequestMethod.POST)
	public String addProduct(@ModelAttribute("SpringWeb") Product product, ModelMap model) {

		model.addAttribute("name", product.getName());
		model.addAttribute("price", product.getPrice());
		model.addAttribute("id", product.getId());
		return "result";
		
		

	}
	
	
	
}
