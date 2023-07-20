package edu.depaul.cdm.se452.concept.base.school.simple;

import java.util.HashMap;

import org.springframework.stereotype.Repository;
/**
 * Example of adding additional finders
 */
@Repository
public class StudentRepository  {
    private static HashMap<Long, Student> STUDENTS= new HashMap<Long, Student>();

    public Student save(Student Student) {
        STUDENTS.put(Student.getId(), Student);
        return Student;
    }    

    public Student findById(Long id) {
        return STUDENTS.get(id);
    }}
