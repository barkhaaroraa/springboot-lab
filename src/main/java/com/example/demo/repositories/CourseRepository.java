package com.example.demo.repositories;

import com.example.demo.Entities.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {
    // You can add custom query methods here if needed
}