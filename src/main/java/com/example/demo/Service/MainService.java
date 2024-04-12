package com.example.demo.Service;

import com.example.demo.Entity.Employee;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class MainService {
    List<Employee> employees = Arrays.asList(
            new Employee(0000001, "Name1", "Surname1"),
            new Employee(0000002, "Name2", "Surname2"),
            new Employee(0000003, "Name3", "Surname3")
    );
}
