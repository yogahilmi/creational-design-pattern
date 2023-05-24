package com.tasanah.creationaldesignpattern.prototype;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(classes = PrototypeApplication.class)
class PrototypeApplicationTest {

    @Autowired
    private ApplicationContext applicationContext;

    @Test
    void testPrototype() {
        var yoga = applicationContext.getBean("employeeManager", Employee.class);
        yoga.setName("Yoga");

        var hilmi = applicationContext.getBean("employeeStaff", Employee.class);
        hilmi.setName("Hilmi");

        var tasanah = applicationContext.getBean("employeeStaff", Employee.class);
        tasanah.setName("Tasanah");

        System.out.println(yoga);
        System.out.println(hilmi);
        System.out.println(tasanah);
    }
}