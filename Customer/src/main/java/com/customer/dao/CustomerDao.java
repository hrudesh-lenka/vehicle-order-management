package com.customer.dao;

import com.customer.model.Customer;
import com.customer.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class CustomerDao implements Dao<Customer>{

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public List<Customer> getAll() {
        return customerRepository.findAll();
    }

    @Override
    public Optional<Customer> get(long id) {
        return customerRepository.findById(id);
    }

    @Override
    public Customer save(Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    public Customer update(Customer customer) {
        Customer updatedCustomer = customerRepository.getOne(customer.getCustomerId());
        updatedCustomer.setFirstName(customer.getFirstName());
        updatedCustomer.setLastName(customer.getLastName());
        updatedCustomer.setPassword(customer.getPassword());
        updatedCustomer.setPhoneNumber(customer.getPhoneNumber());
        updatedCustomer.setUserName(customer.getUserName());
        return customerRepository.save(updatedCustomer);
    }

    @Override
    public void delete(long id) {
        customerRepository.deleteById(id);
    }
}
