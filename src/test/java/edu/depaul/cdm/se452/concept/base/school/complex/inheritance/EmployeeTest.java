package edu.depaul.cdm.se452.concept.base.school.complex.inheritance;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

/**
 * Demonstrate inhertance
 */
public class EmployeeTest {
    @Test
    public void testBasicInheritance() {
        HourlyEmployee hourly = new HourlyEmployee();
        boolean testCase = hourly instanceof Employee;
        assertTrue(testCase);        
    }

    @Test
    public void testToString() {
        HourlyEmployee hourly = new HourlyEmployee();
        hourly.setName("James");
        hourly.setRate(15.25);
        String toString = hourly.toString();
        System.out.println(toString);
        assertNotNull(toString);
    }

}
