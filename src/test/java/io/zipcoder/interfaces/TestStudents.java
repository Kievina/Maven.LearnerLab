package io.zipcoder.interfaces;


import org.junit.Assert;
import org.junit.Test;

public class TestStudents {

    @Test
    public void testGetInstance1() {
        Students students = Students.getInstance();
        int expected = 2;
        int actual = students.personList.size();
        Long expected1 = 11L;
        Long expected2 = 12L;
        students.personList.get(0).getId().equals(expected1);
        students.personList.get(1).getId().equals(expected2);
        Assert.assertTrue(students.personList.get(0).getId().equals(11L));
        Assert.assertTrue(students.personList.get(1).getId().equals(12L));

    }

    public void testGetInstance2() {
        Students students = Students.getInstance();
        int expected = 2;
        int actual = students.personList.size();
        Long expected1 = 11L;
        Long expected2 = 12L;

        Assert.assertTrue(students.personList.get(0).getName().equals("A"));
        Assert.assertTrue(students.personList.get(1).getName().equals("B"));
    }
}
