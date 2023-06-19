package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Course;
import com.example.demo.model.Student;
import com.example.demo.repository.CourseRepo;
import com.example.demo.repository.StudentRepo;

@RestController
@RequestMapping("/api/student/course")
public class StudentController {

    @Autowired
    private StudentRepo studRepo;
    @Autowired
    private CourseRepo courseRepo;

    @PostMapping
    public Student createStudent(@RequestBody Student stud) {
        return studRepo.save(stud);
    }

    @GetMapping
    public List<Student> getAllStudets() {
        return studRepo.findAll();
    }

    @GetMapping("/id/{id}")
    public Student getStudentById(@PathVariable("id") Long studId) {
        return studRepo.findById(studId).get();
    }

    @GetMapping("/name/{name}")
    public Student getStudentContainsName(@PathVariable("name") String studName) {
        return studRepo.findByStudentName(studName);
    }

    @GetMapping("/register/{id1}/{id2}")
    public void registerStudentForCourse(@PathVariable("id1") Long studId, @PathVariable("id2") Long courseId) {
        Student student = studRepo.findById(studId).get();
        Course course = courseRepo.findById(courseId).get();

        student.enrolStudent(course);
    }

}
