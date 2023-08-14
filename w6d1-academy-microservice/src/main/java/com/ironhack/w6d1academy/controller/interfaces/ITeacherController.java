package com.ironhack.w6d1academy.controller.interfaces;

import com.ironhack.w6d1academy.model.Teacher;

import java.util.List;

public interface ITeacherController {
    List<Teacher> getAllTeachers();
    Teacher getTeacherById(Integer id);
}
