package com.samsung.jpademo.repositories;

import com.samsung.jpademo.repositories.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
