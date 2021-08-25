package com.olive.controller;

import java.util.prefs.PreferenceChangeEvent;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.olive.model.Product;

@RestController
public class ProductController {
	
	@GetMapping("/msg")
	public ResponseEntity<String> showMsg(){
		
		return new ResponseEntity<String>("Welcome To Producer App", HttpStatus.OK);
	}
	
	@GetMapping("/data")
	public ResponseEntity<Product> showData(){
		Product product = new Product(10, "Pen", "Sample");
		return new ResponseEntity<Product>(product, HttpStatus.OK);
	}
	
	/* @RequestBody
	 *  this annotation is used for converting the request body into object
	 * into object format and use it input as a method param 
	 * 
	 */
	@PostMapping("/save")
	public ResponseEntity<String> saveData(@RequestBody Product product){
		
	     System.out.println("Product ::  " + product);
		return new ResponseEntity<String>("Save Data", HttpStatus.OK);
	}

}
