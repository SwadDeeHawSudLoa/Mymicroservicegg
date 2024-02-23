package com.example.demo.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.repository.CustomerRepository;
import com.example.demo.domain.Customer;
@Service
public class MyCustomerService {
@Autowired
 private CustomerRepository repo;
	public Customer findCustomerByName(String customerName) {
		Customer result = (Customer) repo.findByName(customerName);
		System.out.printf("%d) name:%s, email:%s %n", result.getId(), result.getName(), result.getEmail());
		return result;
	}
}

