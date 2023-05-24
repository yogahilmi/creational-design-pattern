package com.tasanah.creationaldesignpattern.prototype;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

@SpringBootApplication
public class PrototypeApplication {

    @Bean
    @Scope("prototype")
    public Employee employeeStaff() {
        var employee = new Employee();
        employee.setPosition(Position.STAFF);
        employee.setSalary(10000000L);
        return employee;
    }

    @Bean
    @Scope("prototype")
    public Employee employeeSpv() {
        var employee = new Employee();
        employee.setPosition(Position.SUPERVISOR);
        employee.setSalary(20000000L);
        return employee;
    }

    @Bean
    @Scope("prototype")
    public Employee employeeManager() {
        var employee = new Employee();
        employee.setPosition(Position.MANAGER);
        employee.setSalary(20000000L);
        return employee;
    }

    @Bean
    @Scope("prototype")
    public Employee employeeVP() {
        var employee = new Employee();
        employee.setPosition(Position.VP);
        employee.setSalary(30000000L);
        return employee;
    }
}
