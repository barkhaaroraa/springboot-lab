package com.example.demo.services;

import com.example.demo.Entities.Course;
import org.springframework.stereotype.Service;

// Use for loose coupling...

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseServiceImplementation extends CourseService {
    List<Course> list;

    public CourseServiceImplementation() {
//        Can also be fetched by database...
        list=new ArrayList<>();
        list.add(new Course(333, "Microservices and Spring boot", "Learning Spring Boot framework and microservices architecture"));
        list.add(new Course(222, "Natural Language Processing", "Craeting Real-worl projects using NLP"));
    }

    @Override
    public List<Course> getCourses() {
        return list;
    }

    @Override
    public Course getCourse(long courseId) {

        Course c=null;
        for(Course course:list){
            if (course.getId() == courseId){
                c = course;
                break;
            }
        }
        return c;
    }
//
    @Override
    public Course addCourse(Course course) {
        list.add(course);
        return course;
    }
}
