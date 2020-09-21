package com.ibm.tc.homework.controller;

import com.ibm.tc.homework.model.Customers;



import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
// import com.ibm.tc.homework.model.*;


@RestController
@RequestMapping("/customers")
public class CustomersController {
    private List<Customers> customers = new ArrayList<>();
    private AtomicLong nextId = new AtomicLong();

    @GetMapping("/account")
    public List<Customers> getCustomers() {
        return customers;
    }
    
    @PostMapping("/customer")
    @ResponseStatus(HttpStatus.CREATED)
    public Customers createNewCustomer(@RequestBody Customers customer) {
        // Set custoer to have next ID:
        customer.setId(nextId.incrementAndGet());

        customers.add(customer);
        return customer;
    }
    
    @GetMapping("/account/{id}")
    public Customers getOneCustomer(@PathVariable("id") String customerId) {
        for (Customers customer : customers) {
            if (customer.getCustomerId() == customerId) {
                return customer;
            }
        }

        throw new IllegalArgumentException();
    }
}
