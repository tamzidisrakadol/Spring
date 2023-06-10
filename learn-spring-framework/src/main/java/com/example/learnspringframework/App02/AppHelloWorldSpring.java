package com.example.learnspringframework.App02;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppHelloWorldSpring {

    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(HelloWorldConfigartion.class);

        System.out.println(context.getBean("name"));
        System.out.println(context.getBean("age"));
        System.out.println(context.getBean("person"));
        System.out.println(context.getBean("address"));
        System.out.println(context.getBean("infoWithParameter"));

    }

}

/*
 * launch Spring application Context
 * create a model class with Configuration annotation and create Beans
 * we can give a custom name in Bean("") and must be call with the custom name
 * we can pass the parameter and call the bean
 * in model class we define the bean those all are call together as a bean factory 
 * pojo + Config = Ioc Container / Spring Container => Ready System 
 * Application Context is widely used
 * any Java object is pojo 
 * we can get all the list of beans by Calling Arrays.stream(context.getBeamDefinitionNames()).forEach(System.out::println)
 * if there are conflict on calling Beans we should call one @Primary   
 */