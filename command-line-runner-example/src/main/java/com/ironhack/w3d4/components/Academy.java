package com.ironhack.w3d4.components;

import com.ironhack.w3d4.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Accademy {

    @Autowired
    CourseRepository courseRepository;

    public void getCourse(String id) {
        System.out.println(courseRepository.findById(id));
    }
}
