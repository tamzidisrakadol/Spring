package com.example.learnspringframework.App03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@ComponentScan("com.example.learnspringframework")
@EnableAspectJAutoProxy
public class MainApp {
    public static void main(String[] args) {

        int amount =1000;
        ApplicationContext context = new AnnotationConfigApplicationContext(MainApp.class);
        PaymentService paymentService = context.getBean(PaymentService.class);
        paymentService.makePayment(amount);

    }
}
