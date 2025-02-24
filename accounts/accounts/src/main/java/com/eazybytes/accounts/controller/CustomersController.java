package com.eazybytes.accounts.controller;

import com.eazybytes.accounts.constants.AccountsConstants;
import com.eazybytes.accounts.dto.CustomerDto;
import com.eazybytes.accounts.dto.ErrorResponseDto;
import com.eazybytes.accounts.dto.ResponseDto;
import com.eazybytes.accounts.service.IAccountsService;

import com.eazybytes.accounts.service.ICustomersService;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * @author Mohamed Yehia
 */


@RestController
@RequestMapping(path="/api/customers", produces = {MediaType.APPLICATION_JSON_VALUE})
@AllArgsConstructor
public class CustomersController {

    //private IAccountsService iAccountsService;
    private ICustomersService iCustomersService;



}