package com.example.myfirstproject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController {

    private PaymentService service;

    public PaymentController(PaymentService service){

        this.service = service;

    }

    @GetMapping("/pay")

    public String payment(){

        return service.pay();

    }

}