package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestInstructors {

    @Test
    public void testGetInstance1() {
        Instructors instructors = Instructors.getInstance();
        int expected = 2;
        int actual = instructors.personList.size();
        Long expected1 = 14L;
        Long expected2 = 15L;
        instructors.personList.get(0).getId().equals(expected1);
        instructors.personList.get(1).getId().equals(expected2);
        Assert.assertTrue(instructors.personList.get(0).getId().equals(14L));
        Assert.assertTrue(instructors.personList.get(1).getId().equals(15L));

    }

    @Test
    public void testGetInstance2() {
        Instructors instructors = Instructors.getInstance();
        int expected = 2;
        int actual = instructors.personList.size();
        String expected1 = "First";
        String expected2 = "Second";

        Assert.assertTrue(instructors.personList.get(0).getName().equals("First"));
        Assert.assertTrue(instructors.personList.get(1).getName().equals("Second"));
    }
}
