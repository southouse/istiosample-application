package com.southouse.istio.sample.customer.service;

import com.southouse.istio.sample.customer.entity.Customer;
import com.southouse.istio.sample.customer.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CustomerService {

    private final CustomerRepository customerRepository;

    public Customer getCustomer(Long no) {
        return customerRepository.findById(no).orElseThrow(
                () -> new RuntimeException("Customer Not Found")
        );
    }

    public void createCustomer(Customer customer) {
        customerRepository.save(customer);
    }
}
