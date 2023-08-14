package com.ironhack.w6d1academy.repository;

import com.ironhack.w6d1academy.model.Address;
import com.ironhack.w6d1academy.model.Teacher;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class TeacherRepositoryTest {

    @Autowired
    TeacherRepository teacherRepository;

    @Autowired
    AddressRepository addressRepository;

    @Test
    public void findAll_teachers_teacherList() {
        Address address = new Address("Fake Street", "123");
        addressRepository.save(address);
        Teacher teacher = new Teacher("John Doe", address);
        teacherRepository.save(teacher);

        List<Teacher> teacherList = teacherRepository.findAll();
        for (Teacher teacher1 : teacherList) {
            System.out.println(teacher1);
        }
        assertEquals(4, teacherList.size());

        int lastTeacherIndex = teacherList.size() - 1;
        System.out.println(teacherList.get(lastTeacherIndex).getId());
        teacherRepository.deleteById(teacherList.get(lastTeacherIndex).getId());
    }

    @Test
    public void findById_validId_correctTeacher() {
        Optional<Teacher> teacher = teacherRepository.findById(1);
        assertTrue(teacher.isPresent());
        System.out.println(teacher.get());
        assertEquals("Alberto García", teacher.get().getTeacher());
    }

    @Test
    public void findById_invalidId_teacherNotPresent() {
        Optional<Teacher> teacher = teacherRepository.findById(999);
        assertTrue(teacher.isEmpty());
    }
}