package com.example.courseregisterapp.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RestController;

import com.example.courseregisterapp.model.Course;
import com.example.courseregisterapp.model.CourseRegister;
import com.example.courseregisterapp.service.CourseService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.CrossOrigin;

@RestController
@CrossOrigin(origins = "http://127.0.0.1:5500/")
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

    @PostMapping("/courses/register")
    public String enrollCourse(@RequestParam("name") String name,
            @RequestParam("emailId") String emailId,
            @RequestParam("courseName") String courseName) {
        courseService.enrollCourse(name, emailId, courseName);

        return "Congratulations! " + name + " You have successfully enrolled for " + courseName + " course.";
    }

}
