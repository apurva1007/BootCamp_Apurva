package org.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("org/annotations/app-cntxt.xml");
        Employee employee = (Employee) applicationContext.getBean("employee");

        System.out.println(employee.getId());
        System.out.println(employee.getName());
        System.out.println(employee.getPhone());
        System.out.println(employee.getAddress().getCity());
    }
}
