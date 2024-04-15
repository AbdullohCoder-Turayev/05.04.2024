package com.example.demo.Service;

import com.example.demo.Entity.Customer;
import com.example.demo.Entity.Employee;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
@Service
public class MainService {
    List<Employee> employees = Arrays.asList(
            new Employee(1, "Name1", "Surname1"),
            new Employee(2, "Name2", "Surname2"),
            new Employee(3, "Name3", "Surname3")
    );

    public List<Employee> getEmployees(){
        return employees;
    }

    List<Customer> customers = Arrays.asList(
            new Customer("998901001010", "Name 1", 1),
            new Customer("998901001011", "Name 2", 2),
            new Customer("998901001012", "Name 3", 3)
    );

    public List<Customer> getCustomers(){
        return customers;
    }
}
