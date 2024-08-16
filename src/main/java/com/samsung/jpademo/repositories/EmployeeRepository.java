package com.samsung.jpademo.repositories;

import com.samsung.jpademo.repositories.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    //Custom repository method by query
    @Query(value = "SELECT * FROM employees WHERE email=?1", nativeQuery = true)
    public Employee getEmployee(String email);

    //Custom repository method by Procedure
    @Query(value = "spGetEmployeeByEmail ?1", nativeQuery = true)
    public Employee getEmployeeBySP(String email);

}

