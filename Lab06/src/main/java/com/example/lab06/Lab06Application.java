package com.example.lab06;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Lab06Application {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("appConfig.xml");
        Product product1 = (Product) context.getBean("product1");
        Product product2 = (Product) context.getBean("product2");
        Product product3 = (Product) context.getBean("product3");

        System.out.println("Bean 1: " + product1.getName());
        System.out.println("Bean 2: " + product2.getName());
        System.out.println("Bean 3: " + product3.getName());
    }

}
