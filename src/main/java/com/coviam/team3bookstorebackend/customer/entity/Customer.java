package com.coviam.team3bookstorebackend.customer.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name="Customer")
@Getter
@ToString
@Setter
public class Customer
{
    @Id
    //@GeneratedValue(strategy = GenerationType.AUTO)

    private String customerId;
    private String customerEmail;
    private String customerName;
    private String customerPhoneNo;
    private String customerAddress;
    private String pincode;

}
