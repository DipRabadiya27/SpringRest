package com.springrest.springrest.service;

import com.springrest.springrest.dao.CourseDao;
import com.springrest.springrest.entities.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.*;
import java.util.stream.Collectors;

@Service
public class CourseServiceImpl implements CourseService{


    @Autowired
    private CourseDao courseDao;
//    List<Course>  list;



    public CourseServiceImpl() {
//        list = new ArrayList<>();
//        list.add(new Course(123,"Java Course","This Course for Java DSA"));
//        list.add(new Course(132,"C++ Course","This Course for C++ DSA"));


    }
    @Override
    public List<Course> getCourse() {
        return courseDao.findAll();
    }

    @Override
    public Course getCourse(long courseId) {
//        Course c = null;
//        for(Course course: list) {
//            if(course.getId() == courseId){
//                c=course;
//                break;
//            }
//        }
        return courseDao.getOne(courseId);
    }

    @Override
    public Course addCourse(Course course) {
//        list.add(course);
        courseDao.save(course);
        return course;
    }

    @Override
    public Course updateCourse(Course course) {
//        list.forEach(e -> {
//            if(e.getId() == course.getId()) {
//                e.setTitle(course.getTitle());
//                e.setDescription(course.getDescription());
//            }
//        });
        courseDao.save(course);
        return course;
    }

    @Override
    public void deleteCourse(long parseLong) {
        Course entity = courseDao.getOne(parseLong);
        courseDao.delete(entity);
//        list = this.list.stream().filter(e -> e.getId()!= parseLong).collect(Collectors.toList());
    }
}