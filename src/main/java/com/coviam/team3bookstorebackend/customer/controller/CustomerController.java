package com.coviam.team3bookstorebackend.customer.controller;


import com.coviam.team3bookstorebackend.customer.dto.CustomerDTO;
import com.coviam.team3bookstorebackend.customer.entity.Customer;
import com.coviam.team3bookstorebackend.customer.service.CustomerService;
import com.sun.xml.internal.xsom.impl.scd.Step;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
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
//        if(customerController.getCustomeById(customerDTO.getCustomerId())!=null)
//        {
//            return new ResponseEntity<String>(customerDTO.getCustomerId(),HttpStatus.CREATED);
//            //return "already added";
//        }
//
//        else
  //          {

            Customer customer = new Customer();
            BeanUtils.copyProperties(customerDTO, customer);
            System.out.println(customer);
            Customer customerCreated = customerService.save(customer);
            return customerCreated.getCustomerId();

            //return "Success";
            //}
    }

    @GetMapping(value = "/getCustomerBYId/{Id}")
    public Customer getCustomeById(@PathVariable("Id") String customer_id)
    {
        Optional<Customer> optionalCustomer=customerService.getCustomer(customer_id);
        Customer customer=optionalCustomer.get();
        return  customer;
    }

    @GetMapping(value = "getCustomer")
    public List<Customer> getCustomer()
    {
        return (ArrayList<Customer>)customerService.findAll();
    }

    @GetMapping(value = "/getEmailById/{Id}")
    public String getEmail(@PathVariable("Id") String customer_id)
    {
        return customerService.getEmail(customer_id);
    }

}
