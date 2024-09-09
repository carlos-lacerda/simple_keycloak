package com.chcl.keycloak.demo;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class CustomerDAO {
    public static List<Customer>   customerList = new ArrayList<Customer>();

    public Iterable<Customer> findAll() {
        return customerList;
    }

    public void save(Customer customer1) {
        customerList.add(customer1);
    }
}
