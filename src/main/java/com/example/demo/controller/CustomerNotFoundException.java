package com.example.demo.controller;

public class CustomerNotFoundException extends RuntimeException {

	public CustomerNotFoundException(Integer id) {
    		super("Could not find employee " + id);
	}
	public CustomerNotFoundException(String name) {
    		super("Could not find employee " + name);
	}
}
