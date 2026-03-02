package com.example.myfirstproject;

import org.springframework.stereotype.Service;

@Service
public class PaymentServiceImpl implements PaymentService {

    @Override
    public String pay() {

        return "Payment Successful";

    }

}