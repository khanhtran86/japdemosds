package com.samsung.jpademo.services;

import com.samsung.jpademo.repositories.models.Department;

public interface IDepartmentService {
    public Department getDepartmentById(Long id);
}
