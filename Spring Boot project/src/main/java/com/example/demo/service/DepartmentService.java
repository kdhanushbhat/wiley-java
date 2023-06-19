package com.example.demo.service;

import java.util.List;

import com.example.demo.exception.DepartmentNotFoundException;
import com.example.demo.model.*;

public interface DepartmentService {
    public Department createDepartment(Department department);

    public List<Department> getAllDepartments();

    public Department getDepartmentById(Long departmentId) throws DepartmentNotFoundException;

    public Department updateDepartment(Department department, Long departmentId);

    public void deleteDepartmentById(Long departmentId);

    public Department getDepartmentByName(String departmentName);
}
