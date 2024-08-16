package com.samsung.jpademo.controller;

import com.samsung.jpademo.repositories.models.Department;
import com.samsung.jpademo.repositories.models.Employee;
import com.samsung.jpademo.services.IDepartmentService;
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
    @Autowired
    IDepartmentService departmentService;
    @GetMapping("/")
    public ResponseEntity Index()
    {
        /*
        List<Employee> lstEmployee = employeeService.getAllEmployee();
        return ResponseEntity.ok(lstEmployee);
         */

        //Employee employee = employeeService.getEmployeeByID(8l);

        //return ResponseEntity.ok(employee);

        /*
        Employee emp= Employee.builder().name("Samsung SDS").email("info@samsungsds.com").gender(true).build();
        employeeService.AddEmployee(emp);*/
        //Employee employee = employeeService.getEmplyeeByEmail("khanh.tx@live.com");
        Department d = departmentService.getDepartmentById(1l);
        return ResponseEntity.ok(d.getEmployees());
    }
}
