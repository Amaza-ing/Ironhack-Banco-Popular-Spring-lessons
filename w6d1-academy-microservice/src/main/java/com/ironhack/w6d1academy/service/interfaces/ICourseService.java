package com.ironhack.w6d1academy.service.interfaces;

import com.ironhack.w6d1academy.model.Course;

import java.util.List;
import java.util.Optional;

public interface ICourseService {

    public Course getCourseById(String course);

    List<Course> getCourseByClassroomAndHours(String classroom, Optional<Integer> hours);

    void saveCourse(Course course);

    void updateCourse(Course course, String id);

    void updateCourseHours(Integer hours, String id);

    void updateCourseClassroom(String classroom, String id);

    void deleteCourse(String id);
}
