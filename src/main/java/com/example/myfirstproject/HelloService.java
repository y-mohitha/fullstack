package com.example.myfirstproject;

import org.springframework.stereotype.Service;

@Service
public class HelloService {

    public String message(){

        return "Autowired Working Successfully";

    }
}