package com.example.courseregisterapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.courseregisterapp.model.CourseRegister;
import com.example.courseregisterapp.model.Users;
import com.example.courseregisterapp.service.CourseService;
import com.example.courseregisterapp.service.UserService;

@RestController
@RequestMapping("/admin")
@CrossOrigin(origins = "http://127.0.0.1:5500/")
public class AdminController {

    @Autowired
    UserService userService;

    @Autowired
    CourseService courseService;

    @GetMapping("/courses-enrolled")
    public List<CourseRegister> enrolledStudents() {
        return courseService.enrolledStudents();
    }

    @PostMapping("/add-user")
    public void addUser(@RequestBody Users user) {
        userService.addUser(user);
    }

}
