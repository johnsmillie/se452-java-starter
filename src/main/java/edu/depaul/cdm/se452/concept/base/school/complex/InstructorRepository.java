package edu.depaul.cdm.se452.concept.base.school.complex;

import java.util.HashMap;
import java.util.Optional;
import java.util.Random;
import org.springframework.stereotype.Repository;

@Repository
public class InstructorRepository { 
    private static HashMap<Long, Instructor> INSTRUCTORS = new HashMap<Long, Instructor>();

    public Instructor save(Instructor instructor) {
        if (instructor.getId() == null) {
            instructor.setId(new Random().nextLong());
        }
        INSTRUCTORS.put(instructor.getId(), instructor);
        return instructor;
    }    

    public Instructor findById(Long id) {
        return INSTRUCTORS.get(id);
    }

    public Instructor findByName(String name) {
        Instructor retval = null;

        Optional<Instructor> instructors = INSTRUCTORS.values().stream()
            .filter(instructor -> name.equalsIgnoreCase(instructor.getName()))
            .findFirst();

//        INSTRUCTORS.values().stream().filter( (instructor) -> 
//        instructor.getName().contains(name)).findFirst()
//        );
        retval = instructors.get(); 
        return retval;
    }    
}
