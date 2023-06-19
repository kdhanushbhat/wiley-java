package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.exception.DepartmentNotFoundException;
import com.example.demo.model.Department;
import com.example.demo.service.DepartmentService;

@RestController
public class DepartmentController {

    @Autowired
    private DepartmentService depService;

    @GetMapping("/departments")
    public List<Department> getAllDepartments() {
        return depService.getAllDepartments();
    }

    @PostMapping("/createDep")
    public Department createDepartment(@RequestBody Department department) {
        return depService.createDepartment(department);
    }

    @GetMapping("/department/id/{id}")
    public Department getDepartmentById(@PathVariable("id") Long departmentId) throws DepartmentNotFoundException {
        return depService.getDepartmentById(departmentId);
    }

    @DeleteMapping("/department/id/{id}")
    public String deleteDepartmentById(@PathVariable("id") Long departmentId) {
        depService.deleteDepartmentById(departmentId);
        return "Department deleted succesfully";
    }

    @GetMapping("/department/name/{name}")
    public Department getDepartmentByName(@PathVariable("name") String departmentName) {

        return depService.getDepartmentByName(departmentName);
    }

    @PutMapping("//department/id/{id}")
    public Department updateDepartmentById(
            @PathVariable("id") Long departmentId,
            @RequestBody Department department) {
        return depService.updateDepartment(department, departmentId);
    }
}
