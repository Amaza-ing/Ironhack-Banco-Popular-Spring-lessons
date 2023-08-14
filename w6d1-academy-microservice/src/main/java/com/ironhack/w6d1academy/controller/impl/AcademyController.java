package com.ironhack.w6d1academy.controller.impl;

import com.ironhack.w6d1academy.model.Student;
import com.ironhack.w6d1academy.model.StudentAdmission;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class AcademyController {

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/academy/students/{id}")
    public Student getStudent(@PathVariable Integer id) {
        Student student = restTemplate.getForObject("http://localhost:8082/api/students/" + id, Student.class);
        return student;
    }

    @GetMapping("/academy/students")
    public Student[] getStudents() {
        Student[] students = restTemplate.getForObject("http://localhost:8082/api/students", Student[].class);
        return students;
    }

    @GetMapping("/academy/students/admitted")
    public List<StudentAdmission> getStudentAdmission(@RequestParam(defaultValue = "5") Integer admissionGrade) {
        List<StudentAdmission> studentAdmissionList = new ArrayList<>();

        Student[] students = restTemplate.getForObject("http://localhost:8082/api/students", Student[].class);

        for (Student student : students) {
            Boolean isAdmitted = student.getGrade() >= admissionGrade;
            StudentAdmission studentAdmission = new StudentAdmission(student.getId(), isAdmitted);
            studentAdmissionList.add(studentAdmission);
        }

        return studentAdmissionList;
    }

}
