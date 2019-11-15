package io.zipcoder.interfaces;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EducatorTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testTeach() {
        Student student = new Student(31L, "Kievina");
        Educator.INSTRUCTOR1.teach(student, 20.0);
        Assert.assertEquals(student.getTotalStudyTime(), Educator.INSTRUCTOR1.getTimeWorked(), 0.0);
    }

    @Test
    public void testLecture() {
        Student student1 = new Student(31L, "Kievina");
        Student student2 = new Student(32L, "Kris");
        Student[] students = {student1, student2};
        int numberOfHours = 20;
        int expected = numberOfHours / students.length;

        Educator.INSTRUCTOR1.lecture(students, 20.0);

        Assert.assertEquals(expected, student1.getTotalStudyTime(), 0.0);
        Assert.assertEquals(expected, student2.getTotalStudyTime(), 0.0);

    }

    @Test
    public void testGetTimeWorked() {
        double expected = 20.0;
        Educator.INSTRUCTOR1.setTimeWorked(expected);
        Assert.assertEquals(expected, Educator.INSTRUCTOR1.getTimeWorked(), 0.0);
    }
}