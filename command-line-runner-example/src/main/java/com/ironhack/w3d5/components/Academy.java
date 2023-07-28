package com.ironhack.w3d5.components;

import com.ironhack.w3d5.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Academy {

    @Autowired
    CourseRepository courseRepository;

    public void getCourse(String id) {
        System.out.println(courseRepository.findById(id));
    }
}
