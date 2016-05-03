package com.sood.musicstore.DAO;

import java.io.IOException;
import java.util.ArrayList;

import com.sood.musicstore.BO.Product;

public class ProductDao {
	
	ArrayList<Product> productlist;
	
	public ArrayList<Product> getProducts()
	{
		Product product=new Product();
		product.setProductName("Jimmy Hendrix");
		product.setProductCategory("Record");
		product.setProductDescription("Records of Jimmy Hendrix Album ABC");
		product.setProductManufacturer("XYZ Record Company");
		product.setProductCondition("Good");
		product.setProductPrice(1000);
		product.setProductStatus("Available");
		product.setUnitsinStock(100);
		
		Product product1=new Product();
		product1.setProductName("Kurt Kobain");
		product1.setProductCategory("Record");
		product1.setProductDescription("Records of Kurt Kobain Album ABC");
		product1.setProductManufacturer("XYZ Record Company");
		product1.setProductCondition("Bad");
		product1.setProductPrice(1000);
		product1.setProductStatus("Available");
		product1.setUnitsinStock(100);
		
		productlist=new ArrayList<Product>();
		
		productlist.add(product);
		productlist.add(product1);		
		
		return productlist;
		
	}
	
	public Product getProductById(String id) throws IOException
	{
		ArrayList<Product> productlist=getProducts();
		for(Product product:productlist)
		{
			if(product.getProductId().equals(id))
			{
				return product;
			}
		}
		
		throw new IOException("product not found");
		
	}

}
