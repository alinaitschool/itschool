package com.github.alina.session_17_generics.practice;

import java.util.HashSet;
import java.util.Set;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee emp1 = new Employee(1L, "Alina", "Ghetler");
        Employee emp2 = new Employee(1L, "Alina", "Ghetler");

        System.out.println("emp1 equal emp2 " + emp1.equals(emp2));
        Set<Employee> employeeSet= new HashSet<>();
    }
}
