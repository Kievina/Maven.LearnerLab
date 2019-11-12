package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestStudent {

    @Test
    public void testImplementation() {
        Student student = new Student(Long.MIN_VALUE, "");
        Assert.assertTrue(student instanceof Learner);
    }

    @Test
    public void testInheritance() {
        Student student = new Student(Long.MIN_VALUE, "");
        Assert.assertTrue(student instanceof Person);
    }

    @Test
    public void testLearn() {
        Student student = new Student(Long.MIN_VALUE, "");
        student.learn(5.0);
        Double expected = 5.0;
        Double actual = student.getTotalStudyTime();
        Assert.assertEquals(expected, actual );

    }
}
