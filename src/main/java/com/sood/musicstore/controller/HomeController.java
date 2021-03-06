package com.sood.musicstore.controller;



import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sood.musicstore.BO.Product;
import com.sood.musicstore.DAO.ProductDao;

@Controller
public class HomeController {

	@RequestMapping(value="/")
	public ModelAndView home(){
		System.out.println("yo");
		return new ModelAndView("home");
		
	}
	
	@RequestMapping(value="/products")
	public ModelAndView product()
	{	ProductDao dao=new ProductDao();
		ArrayList<Product> productlist=dao.getProducts();
		return new ModelAndView("products","productlist",productlist);
	}
	
	@RequestMapping(value="/products/viewproduct/{productId}")
	public ModelAndView productdetail(@PathVariable String productId)
	{
		return new ModelAndView("productDetail");
		
	}
}
