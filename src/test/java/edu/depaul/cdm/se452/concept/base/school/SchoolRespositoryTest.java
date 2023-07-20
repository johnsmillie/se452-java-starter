package edu.depaul.cdm.se452.concept.base.school;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import edu.depaul.cdm.se452.concept.base.school.complex.School;
import edu.depaul.cdm.se452.concept.base.school.complex.SchoolRepository;

public class SchoolRespositoryTest {

    @Test
    public void testFind() {
        SchoolRepository repo = new SchoolRepository();
        School i1 = new School();
        i1.setName("DePaul");
        repo.save(i1);

        School i2 = new School();
        i2.setName("Loyla");
        repo.save(i2);
        
        School find = repo.findByName("DePaul");
        assertEquals(find,i1);
    }    
    
}
