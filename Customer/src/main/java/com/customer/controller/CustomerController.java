package com.customer.controller;

import com.customer.dao.CustomerDao;
import com.customer.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/customer")
public class CustomerController {

    @Autowired
    private CustomerDao customerDao;

    @GetMapping("/")
    public String home(){
        return "Customer Service";
    }

    @GetMapping("/all")
    public List<Customer> getAllCustomers(){
        return customerDao.getAll();
    }

    @GetMapping("/{customerId}")
    public Optional<Customer> getCustomer(@PathVariable Long customerId){
        return customerDao.get(customerId);
    }

    @PostMapping("/create")
    public Customer createUser(@RequestBody Customer customer){
        return customerDao.save(customer);
    }

    @PostMapping("/update")
    public Customer updateUser(@RequestBody Customer customer){
        return customerDao.update(customer);
    }

    @DeleteMapping("/delete/{customerId}")
    public void deleteUser(@PathVariable Long customerId){
        customerDao.delete(customerId);
    }
}
