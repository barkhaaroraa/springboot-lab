package com.example.demo.controller;

import com.example.demo.Entities.Course;
import com.example.demo.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;




import com.example.demo.Entities.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/courses")  // Base URL for this controller
public class MyController {

    @Autowired
    private CourseService courseService;

    // ✅ FIXED: No duplicate "/courses" in the path
    @GetMapping
    public List<Course> getCourses() {
        return this.courseService.getCourses();
    }

    // ✅ FIXED: No duplicate "/courses" in the path
    @GetMapping("/{courseId}")
    public Course getCourse(@PathVariable long courseId) {
        return this.courseService.getCourse(courseId);
    }

    // ✅ FIXED: No duplicate "/courses" in the path
    @PostMapping
    public Course addCourse(@RequestBody Course course) {
        return this.courseService.addCourse(course);
    }
}
