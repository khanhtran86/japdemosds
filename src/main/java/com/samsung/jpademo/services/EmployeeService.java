package com.samsung.jpademo.services;

import com.samsung.jpademo.repositories.EmployeeRepository;
import com.samsung.jpademo.repositories.models.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService implements IEmployeeService{

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public List<Employee> getAllEmployee() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee getEmployeeByID(Long id) {
        return employeeRepository.findById(id).get();
    }

    @Override
    public void AddEmployee(Employee employee)
    {
        //Add object to database
        employeeRepository.save(employee);
    }

}
