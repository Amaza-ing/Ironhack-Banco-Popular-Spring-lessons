package com.ironhack.w6d1academy.controller.interfaces;

import com.ironhack.w6d1academy.controller.dto.CourseClassroomDTO;
import com.ironhack.w6d1academy.controller.dto.CourseHoursDTO;
import com.ironhack.w6d1academy.model.Course;

import java.util.List;
import java.util.Optional;

public interface ICourseController {

    //  ****************************************************  GET  ****************************************************

    List<Course> getAllCourses();
    Course getCourseById(String course);
    List<Course> getCourseByHoursLessThan(Integer hours);
    List<Course> getCourseByClassroomAndHours(String classroom, Optional<Integer> hours);


    //  ***************************************************  POST  ****************************************************

    void saveCourse(Course course);


    //  ****************************************************  PUT  ****************************************************

    void updateCourse(Course course, String id);


    //  ***************************************************  PATCH  ***************************************************

    void updateCourseHours(CourseHoursDTO courseHoursDTO, String id);
    void updateCourseClassroom(CourseClassroomDTO courseClassroomDTO, String id);


    //  **************************************************  DELETE  ***************************************************

    void deleteCourse(String id);
}
