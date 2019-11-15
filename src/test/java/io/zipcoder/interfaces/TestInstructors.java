package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestInstructors {

    @Test
    public void testGetInstance1() {
        Instructors instructors = Instructors.getInstance();
        Long expected1 = 14L;
        Long expected2 = 15L;

        Long actual1 = instructors.personList.get(0).getId();
        Long actual2 = instructors.personList.get(1).getId();

        Assert.assertEquals(expected1, actual1);
        Assert.assertEquals(expected2, actual2);
    }

    @Test
    public void testGetInstance2() {
        Instructors instructors = Instructors.getInstance();
        String expected1 = "First";
        String expected2 = "Second";

        String actual1 = instructors.personList.get(0).getName();
        String actual2 = instructors.personList.get(1).getName();

        Assert.assertEquals(expected1, actual1);
        Assert.assertEquals(expected2, actual2);
    }
}
