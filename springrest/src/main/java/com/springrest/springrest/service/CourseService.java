package com.springrest.springrest.service;
import com.springrest.springrest.entities.Course;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.*;
public interface CourseService {
    public List<Course> getCourse();

    public Course getCourse(long courseId);
    public Course addCourse(Course course);
    public Course updateCourse(Course course);

    public void deleteCourse(long parseLong);
}
