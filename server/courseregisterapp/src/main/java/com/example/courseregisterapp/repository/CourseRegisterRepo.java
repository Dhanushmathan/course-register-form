package com.example.courseregisterapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.courseregisterapp.model.CourseRegister;

@Repository
public interface CourseRegisterRepo extends JpaRepository<CourseRegister, Integer> {
    
}
