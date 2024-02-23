/*package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.MessageDTO;
import com.example.demo.domain.Customer;
import com.example.demo.service.MyCustomerService;
import com.example.demo.service.MessageService; // Correct import for MessageService
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class HelloController {
    @Autowired
    private MessageService messageService;

    @Autowired
    private MyCustomerService customerService;

    @GetMapping("/hello")
    public MessageDTO sayHello(@RequestParam String user) {
        MessageDTO message = messageService.getSubscriptionMessage(user);
        return message;
    }

    @GetMapping("/findCustomer")
    public Customer findCustomerByName(@RequestParam String name) {
        Customer cust = customerService.findCustomerByName(name);
        return cust;
    }
}
*/