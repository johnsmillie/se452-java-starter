package edu.depaul.cdm.se452.concept.base.school.simple;

import java.util.HashMap;

import org.springframework.stereotype.Repository;

@Repository
public class CourseRepository {
    private static HashMap<Long, Course> COURSE = new HashMap<Long, Course>();

    public Course save(Course course) {
        COURSE.put(course.getId(), course);
        return course;
    }    

    public Course findById(Long id) {
        return COURSE.get(id);
    }
}
