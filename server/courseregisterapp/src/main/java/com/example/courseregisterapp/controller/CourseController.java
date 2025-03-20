package com.example.courseregisterapp.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RestController;

import com.example.courseregisterapp.model.Course;
import com.example.courseregisterapp.model.CourseRegister;
import com.example.courseregisterapp.service.CourseService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class CourseController {

    @Autowired
    CourseService courseService;

    @GetMapping("courses")
    public List<Course> availableCourses() {
        return courseService.availableCourses();
    }

    @GetMapping("courses/enrolled")
    public List<CourseRegister> enrolledStudents() {
        return courseService.enrolledStudents();
    }

}
