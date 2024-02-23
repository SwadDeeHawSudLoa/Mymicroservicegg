package com.example.demo.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import com.example.demo.domain.Customer;

public class ClassicCustomerRepository {
    @PersistenceContext
    EntityManager em;

    public List<Customer> findByName(String name) {
        TypedQuery<Customer> q = em.createNamedQuery("searchCustomerByName", Customer.class);
        q.setParameter("name", name);
        return q.getResultList();
    }
}
