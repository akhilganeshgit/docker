package org.dxc.docker.controller;

import org.dxc.docker.model.Customer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {
	@RequestMapping("/customer")
	public Customer displayCustomer() {
		Customer customer =new Customer("Akhil","akhilganesh123@gmail.com","8113863756");
		return customer;
	}

}
