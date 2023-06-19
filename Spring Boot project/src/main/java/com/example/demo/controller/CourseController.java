package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Course;
import com.example.demo.repository.CourseRepo;

@RestController
@RequestMapping("/api/course")
public class CourseController {
    @Autowired
    private CourseRepo courseRepo;

    @GetMapping("/courses")
    public List<Course> getAllCourses() {
        return courseRepo.findAll();
    }

    @GetMapping(value = "/search/{price}")
    public List<Course> getCourseLessThanFee(@PathVariable("price") Double fee) {
        return courseRepo.findByCourseFeeLessThan(fee);
    }

}
