package com.coviam.team3bookstorebackend.customer.service.serviceimpl;

import com.coviam.team3bookstorebackend.customer.entity.Customer;
import com.coviam.team3bookstorebackend.customer.repositery.CustomerRepositery;
import com.coviam.team3bookstorebackend.customer.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.xml.soap.SAAJResult;
import java.util.Optional;

public class CustomerServiceImpl implements CustomerService
{
    @Autowired
    CustomerRepositery customerRepositery;

    @Override
    public Customer save(Customer customer) {
        return customerRepositery.save(customer);
    }

    @Override
    public Optional<Customer> getCustomer(String customer_id) {
        return customerRepositery.findById(customer_id);
    }

}
