package edu.depaul.cdm.se452.concept.base.school.simple;

import java.util.Random;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Minimialist code to map against database when then table/column is same as the class/property
 */
@Data
@AllArgsConstructor
public class Course {
    private Long id = new Random().nextLong();

    private String dept;

    private String num;
}