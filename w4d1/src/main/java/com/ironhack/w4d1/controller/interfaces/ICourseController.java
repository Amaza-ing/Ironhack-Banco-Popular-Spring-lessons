package com.ironhack.w4d1.controller.interfaces;

import com.ironhack.w4d1.model.Course;

import java.util.List;
import java.util.Optional;

public interface ICourseController {
    List<Course> getAllCourses();
    Course getCourseById(String course);
    List<Course> getCourseByHoursLessThan(Integer hours);
    List<Course> getCourseByClassroomAndHours(String classroom, Optional<Integer> hours);
}
