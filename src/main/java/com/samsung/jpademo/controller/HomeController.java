package com.samsung.jpademo.controller;

import com.samsung.jpademo.repositories.models.Employee;
import com.samsung.jpademo.services.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HomeController {
    @Autowired
    IEmployeeService employeeService;
    @GetMapping("/")
    public ResponseEntity Index()
    {
        /*
        List<Employee> lstEmployee = employeeService.getAllEmployee();
        return ResponseEntity.ok(lstEmployee);
         */

        //Employee employee = employeeService.getEmployeeByID(8l);

        //return ResponseEntity.ok(employee);

        Employee emp= Employee.builder().name("Samsung SDS").email("info@samsungsds.com").gender(true).build();
        employeeService.AddEmployee(emp);
        return ResponseEntity.ok("Added");
    }
}
