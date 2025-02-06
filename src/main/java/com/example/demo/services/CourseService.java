package com.example.demo.services;
import com.example.demo.Entities.Course;
import java.util.List;

public abstract class CourseService {
    public abstract List<Course>getCourses();
    public abstract Course getCourse(long courseId);
    public abstract Course addCourse(Course course);
    
}
