package com.example.courseregisterapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.courseregisterapp.model.Users;

@Repository
public interface UserDetailsRepo extends JpaRepository<Users, Integer> {
    Users getByUsername(String username);
}
