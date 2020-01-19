package com.coviam.team3bookstorebackend.customer.controller;


import com.coviam.team3bookstorebackend.customer.dto.CustomerDTO;
import com.coviam.team3bookstorebackend.customer.entity.Customer;
import com.coviam.team3bookstorebackend.customer.service.CustomerService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/customer")
public class CustomerController
{
    @Autowired
    private CustomerService customerService;

    @Autowired
    private CustomerController customerController;

    @PostMapping(value = "/add")
    public String addCustomer(@RequestBody CustomerDTO customerDTO)
    {
        if(customerController.getCustomeById(customerDTO.getCustomer_id())!=null)
        {
            return "already added";
        }

        else
            {

            Customer customer = new Customer();
            BeanUtils.copyProperties(customerDTO, customer);
            Customer customerCreated = customerService.save(customer);
            return "Success";
            }
    }

    @GetMapping(value = "/getCustomer/{Id}")
    public Customer getCustomeById(@PathVariable("Id") String customer_id)
    {
        Optional<Customer> optionalCustomer=customerService.getCustomer(customer_id);
        Customer customer=optionalCustomer.get();
        return  customer;
    }

}
