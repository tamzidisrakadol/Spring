package com.example.learnspringframework.App02;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person(String name, int age) {
};

record Address(String road, int buildingNumber) {
};

record Info(Person person, Address address) {
};

@Configuration
public class HelloWorldConfigartion {

    @Bean
    public String name() {
        return "Tamzid Israk";
    }

    @Bean
    public int age() {
        return 24;
    }

    @Bean
    public Person person() {
        return new Person("ADOL ISRAK", 25);
    }

    @Bean
    public Address address() {
        return new Address("Hamid road", 55);
    }

    @Bean
    public Person personVIP() {
        return new Person("TOM FORD", 29);
    }

    @Bean
    public Address address2() {
        return new Address("Hamid road Pabna Sadar", 88);
    }

    @Bean
    public Info info() {
        return new Info(new Person("Bary A Bard", 30), new Address("Park Street London", 22));
    }

    @Bean
    public Info infoWithParameter(Person personVIP, Address address2) {
        return new Info(personVIP, address2);
    }

}
