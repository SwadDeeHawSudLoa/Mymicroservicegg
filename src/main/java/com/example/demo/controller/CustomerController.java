package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.Customer;
import com.example.demo.repository.CustomerRepository;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/api")
public class CustomerController {

	@Autowired
	private CustomerRepository repository;

	public CustomerController() {
	}

	public CustomerController(CustomerRepository repository) {
		this.repository = repository;
	}

	// http://localhost:8080/api/customer?name=richy
	@GetMapping("/customer")
	public List<Customer> searchCustomer(@RequestParam("name") String name) {
		return repository.findByName(name);

	}

	@PutMapping("/customers/{id}")
	public Customer replaceEmployee(@RequestBody Customer newCustomer, @PathVariable Integer id) {
		return repository.findById(id).map(customer -> {
			customer.setName(newCustomer.getName());
			customer.setEmail(newCustomer.getEmail());
			return repository.save(customer);
		}).orElseGet(() -> {
			newCustomer.setId(id);
			return repository.save(newCustomer);
		});
	}

	@DeleteMapping("/employees/{id}")
	void deleteEmployee(@PathVariable Integer id) {
		repository.deleteById(id);
	}

	@GetMapping("/customers")
	public List<Customer> all() {
		return repository.findAll();
	}

	@GetMapping("/customer/{id}")
	public Optional<Customer> searchCustomer(@PathVariable("id") Integer id) {
		return repository.findById(id);
	}

}
