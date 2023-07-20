package edu.depaul.cdm.se452.concept.base.school.complex;

import java.util.HashMap;

import org.springframework.stereotype.Repository;

@Repository
public class UniversityRepository { 
    private static HashMap<Long, University> UNIVERSITY = new HashMap<Long, University>();

    public University save(University course) {
        UNIVERSITY.put(course.getId(), course);
        return course;
    }    

    public University findById(Long id) {
        return UNIVERSITY.get(id);
    }

    public University findByName(String name) {
        University retval = null;
        for(University university : UNIVERSITY.values()) {
            if (university.getName().equalsIgnoreCase(name)) {
                retval = university;
            }
        }
        return retval;
    }
}