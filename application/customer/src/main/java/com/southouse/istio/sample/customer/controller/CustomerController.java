package com.southouse.istio.sample.customer.controller;

import com.southouse.istio.sample.customer.entity.Customer;
import com.southouse.istio.sample.customer.service.CustomerService;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1")
public class CustomerController {

    private final CustomerService customerService;

    @GetMapping("customer")
    public String customer(HttpServletRequest request) {
        return "You hit '" + request.getRequestURI() + "'";
    }

    @GetMapping("customer/{no}")
    public Customer getCustomer(@PathVariable(name = "no", required = true) Long no) {
        Customer customer = customerService.getCustomer(no);

        return customerService.getCustomer(no);
    }

    @PostMapping("customer")
    public void createCustomer(@RequestBody Customer customer) {
        customerService.createCustomer(customer);
    }

}
