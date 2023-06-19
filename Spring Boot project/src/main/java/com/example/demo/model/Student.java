package com.example.demo.model;

import java.util.List;

// import com.fasterxml.jackson.annotation.JsonBackReference;
// import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long studentId;
    private String studentName;
    private String studentGrade;

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name = "STUD_COURSES", joinColumns = @JoinColumn(name = "studentId", referencedColumnName = "studentId"), inverseJoinColumns = @JoinColumn(name = "courseId", referencedColumnName = "courseId"))

    private List<Course> courses;

    @Override
    public String toString() {
        return this.studentId + " , " + this.studentName;
    }

    public void enrolStudent(Course c) {
        System.out.println(this.toString() + "\n " + c);
        courses.add(c);
    }

}
