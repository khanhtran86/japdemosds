package com.samsung.jpademo.services;

import com.samsung.jpademo.repositories.models.Employee;

import java.util.List;

public interface IEmployeeService {
    List<Employee> getAllEmployee();

    public Employee getEmployeeByID(Long id);

    public void AddEmployee(Employee employee);
}
