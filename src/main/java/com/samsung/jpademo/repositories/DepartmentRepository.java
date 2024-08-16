package com.samsung.jpademo.repositories;

import com.samsung.jpademo.repositories.models.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
