package com.ironhack.w6d1academy.model;

import jakarta.persistence.*;

public class Student {
    private Integer id;
    private Integer grade;

    private StudentInfo studentInfo;

    public Student() {
    }

    public Student(Integer grade, StudentInfo studentInfo) {
        this.grade = grade;
        this.studentInfo = studentInfo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    public StudentInfo getStudentInfo() {
        return studentInfo;
    }

    public void setStudentInfo(StudentInfo studentInfo) {
        this.studentInfo = studentInfo;
    }
}
