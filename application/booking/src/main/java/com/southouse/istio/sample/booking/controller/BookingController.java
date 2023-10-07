package com.southouse.istio.sample.booking.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1")
public class BookingController {

    @GetMapping("booking")
    public String booking(HttpServletRequest request) {
        return "You hit '" + request.getRequestURI() + "'";
    }

}
