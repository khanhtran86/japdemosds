package com.samsung.jpademo.services;

import com.samsung.jpademo.repositories.DepartmentRepository;
import com.samsung.jpademo.repositories.models.Department;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService implements IDepartmentService{
    DepartmentRepository departmentRepository;
    public DepartmentService(DepartmentRepository departmentRepository)
    {
        this.departmentRepository = departmentRepository;
    }

    @Override
    public Department getDepartmentById(Long id) {
        return this.departmentRepository.findById(id).get();
    }
}
