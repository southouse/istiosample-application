package com.southouse.istio.sample.shopping.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1")
public class ShoppingController {

    @GetMapping("shopping")
    public String shopping(HttpServletRequest request) {
        return "You hit '" + request.getRequestURI() + "'";
    }

}
