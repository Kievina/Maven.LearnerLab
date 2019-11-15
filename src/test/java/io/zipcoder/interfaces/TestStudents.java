package io.zipcoder.interfaces;


import org.junit.Assert;
import org.junit.Test;

public class TestStudents {

    @Test
    public void testGetInstance1() {
        Students students = Students.getInstance();
        Long expected1 = 11L;
        Long expected2 = 12L;
        Long actual1 = students.personList.get(0).getId();
        Long actual2 = students.personList.get(1).getId();
        Assert.assertEquals(expected1, actual1);
        Assert.assertEquals(expected2, actual2);
    }

    @Test
    public void testGetInstance2() {
        Students students = Students.getInstance();
        String expected1 = "A";
        String expected2 = "B";
        String actual1 = students.personList.get(0).getName();
        String actual2 = students.personList.get(1).getName();
        Assert.assertEquals(expected1, actual1);
        Assert.assertEquals(expected2, actual2);
    }
}
