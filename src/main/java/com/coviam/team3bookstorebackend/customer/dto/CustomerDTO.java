package com.coviam.team3bookstorebackend.customer.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CustomerDTO
{
    private String customer_id;
    private String email;
    private String customer_name;
    private String phone_no;
    private String address;
    private String pincode;
}
