package com.example.mongodbtest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/customer")
public class CustomerController {

    CustomerService customerService;

    public List<Customer> getAllCustomers() {
        return customerService.getAllCustomers();
    }

}
