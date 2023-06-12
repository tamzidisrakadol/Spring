package com.example.learnspringframework.App03;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
@Configuration
public class PaymentServiceImpl implements PaymentService{


    @Override
    public void makePayment(int amount) {
       
        System.out.println(amount +" Payment Started amount Debited");

        System.out.println("Processing....");

        System.out.println(amount +" payment successfully amount credited");
    }

}
