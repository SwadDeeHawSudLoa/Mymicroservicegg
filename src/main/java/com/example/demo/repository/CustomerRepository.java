package com.example.demo.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.domain.*;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

	public List<Customer> findByName(String name);

	public Optional<Customer> findById(Integer id);

	public Customer findByEmail(String email);

	public Customer findByEmailAndName(String email, String name);

	public List<Customer> findByName(String name, Sort sort);

	public Page<Customer> findByName(String name, Pageable pageable);

}
