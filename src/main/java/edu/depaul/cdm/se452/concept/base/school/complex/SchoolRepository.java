package edu.depaul.cdm.se452.concept.base.school.complex;

import java.util.HashMap;
import java.util.Random;

import org.springframework.stereotype.Repository;

@Repository
public class SchoolRepository  { 
    private static HashMap<Long, School> SCHOOL = new HashMap<Long, School>();

    public School save(School school) {
        if (school.getId() == null) {
            school.setId(new Random().nextLong());
        }        
        SCHOOL.put(school.getId(), school);
        return school;
    }    

    public School findById(Long id) {
        return SCHOOL.get(id);
    }

    public School findByName(String name) {
        School retval = null;
        for(School school : SCHOOL.values()) {
            if (school.getName().equalsIgnoreCase(name)) {
                retval = school;
            }
        }
        return retval;
    }    
}