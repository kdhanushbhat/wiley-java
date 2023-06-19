package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.exception.DepartmentNotFoundException;
import com.example.demo.model.Department;
import com.example.demo.repository.DepartmentRepo;

@Service
public class DepartmentServiceImpl implements DepartmentService {
    @Autowired
    private DepartmentRepo depRepo;

    @Override
    public Department createDepartment(Department department) {
        return depRepo.save(department);
    }

    @Override
    public void deleteDepartmentById(Long departmentId) {
        depRepo.deleteById(departmentId);
    }

    @Override
    public List<Department> getAllDepartments() {
        // TODO Auto-generated method stub
        return depRepo.findAll();
    }

    @Override
    public Department getDepartmentById(Long departmentId) throws DepartmentNotFoundException {
        // TODO Auto-generated method stub
        Optional<Department> department = depRepo.findById(departmentId);
        if (!department.isPresent())
            throw new DepartmentNotFoundException("Department with ID: " + departmentId + " not present");
        return department.get();
    }

    @Override
    public Department getDepartmentByName(String departmentName) {
        // TODO Auto-generated method stub
        return depRepo.findByDepartmentName(departmentName);
    }

    @Override
    public Department updateDepartment(Department department, Long departmentId) {
        // TODO Auto-generated method stub
        return depRepo.save(department);
    }

}
