package com.cdk.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/cdk/example/spring-config.xml");
        Employee employee = (Employee) applicationContext.getBean("employee");

        System.out.println(employee.getId());
        System.out.println(employee.getName());
    }
}
