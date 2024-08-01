package com.github.alina.session_17_generics.practice;

import java.util.Objects;

public class Employee {
    private long id;
    private String firstName;
    private String  secondName;

    public long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public Employee(long id, String firstName, String secondName) {
        this.id = id;
        this.firstName = firstName;
        this.secondName = secondName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return getId() == employee.getId() && Objects.equals(getFirstName(), employee.getFirstName()) && Objects.equals(secondName, employee.secondName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getFirstName(), secondName);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                '}';
    }
}
