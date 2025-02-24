package com.eazybytes.accounts.service;

import com.eazybytes.accounts.dto.CustomerDto;

public interface ICustomersService {

    void addCustomer(CustomerDto customerDto);

    CustomerDto fetchCustomer(String mobileNumber);

    boolean updateCustomer(CustomerDto customerDto);

    boolean deleteCustomer(String mobileNumber);

}