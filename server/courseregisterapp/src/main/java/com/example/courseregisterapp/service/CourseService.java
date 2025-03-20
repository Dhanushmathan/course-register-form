package com.example.courseregisterapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.courseregisterapp.model.Course;
import com.example.courseregisterapp.model.CourseRegister;
import com.example.courseregisterapp.repository.CourseRegisterRepo;
import com.example.courseregisterapp.repository.CourseRepo;

@Service
public class CourseService {

    @Autowired
    CourseRepo courseRepo;

    @Autowired
    CourseRegisterRepo courseRegisterRepo;

    public List<Course> availableCourses() {
        return courseRepo.findAll();
    }

    public List<CourseRegister> enrolledStudents() {
        return courseRegisterRepo.findAll();
    }

}
