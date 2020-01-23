package com.coviam.team3bookstorebackend.customer.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CustomerDTO
{
    private String customerId;
    private String customerEmail;
    private String customerName;
    private String customerPhoneNumber;
    private String customerAddress;
    private String pincode;
}
