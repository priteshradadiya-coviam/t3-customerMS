package com.coviam.team3bookstorebackend.customer.repositery;

import com.coviam.team3bookstorebackend.customer.entity.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CustomerRepositery extends CrudRepository<Customer,String> {
}
