package com.coviam.team3bookstorebackend.customer.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="Customer")
@Getter
@Setter
public class Customer
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String customer_id;
    private String email;
    private String customer_name;
    private String phone_no;
    private String address;
    private String pincode;

}
