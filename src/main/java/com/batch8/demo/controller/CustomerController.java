package com.batch8.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.batch8.demo.dao.CustomerDAO;
import com.batch8.demo.model.Customer;

@RestController
public class CustomerController {
	
	@Autowired
	CustomerDAO cusDAO;
	
	//getCustomers-->to get data of all customers
	@RequestMapping(value = "/customers",method = RequestMethod.GET ,produces = { MediaType.APPLICATION_JSON_VALUE })
	public List<Customer> getCustomers(){
		List<Customer> list= cusDAO.getCustomers();
		return list;
	}
	
	//getCustomer-->to get a particular customer data-->cusId
	@RequestMapping(value = "/customer/{cusId}",method = RequestMethod.GET ,produces = { MediaType.APPLICATION_JSON_VALUE })
	public Customer getCustomerData(@PathVariable("cusId") String Id){
		return cusDAO.getCustomerData(Id);
	}
	
	//ADD a customer
	@RequestMapping(value = "/addCustomer",method = RequestMethod.POST ,produces = { MediaType.APPLICATION_JSON_VALUE })
	public Customer addCustomer(@RequestBody Customer cus){
		return cusDAO.addCustomer(cus);
	}
	
	//Deleting a customer--using id

}
