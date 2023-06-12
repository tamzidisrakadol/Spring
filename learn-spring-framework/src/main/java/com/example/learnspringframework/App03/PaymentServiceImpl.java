package com.example.learnspringframework.App03;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
@Configuration
public class PaymentServiceImpl implements PaymentService{

    @Bean
    @Override
    public void makePayment() {
       
        System.out.println("Payment Started amount Debited");

        System.out.println("Processing....");

        System.out.println("payment successfull amount credited");
    }


    
}
