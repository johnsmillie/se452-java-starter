package edu.depaul.cdm.se452.concept.base.school;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import edu.depaul.cdm.se452.concept.base.school.complex.Instructor;
import edu.depaul.cdm.se452.concept.base.school.complex.InstructorRepository;

public class InstructorRepositoryTest {
    @Test
    public void testFind() {
        InstructorRepository repo = new InstructorRepository();
        Instructor i1 = new Instructor();
        i1.setName("Dave");
        repo.save(i1);

        Instructor i2 = new Instructor();
        i2.setName("Sam");
        repo.save(i2);
        
        Instructor find = repo.findByName("Dave");
        assertEquals(find.getName(), i1.getName());
    }    
}
