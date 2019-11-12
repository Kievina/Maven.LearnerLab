package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestInstructor {
    @Test
    public void testImplementation() {
        Instructor instructor = new Instructor(Long.MIN_VALUE, "");
        Assert.assertTrue(instructor instanceof Teacher);
    }

    @Test
    public void testInheritance() {
        Instructor instructor = new Instructor(Long.MIN_VALUE, "");
        Assert.assertTrue(instructor instanceof Person);
    }

    @Test
    public void testTeach() {
        Instructor instructor = new Instructor(Long.MIN_VALUE, "");
        Learner student = new Student(Long.MIN_VALUE, "");
        double expected = 6.0;

        instructor.teach(student, 6.0);
        double actual = student.getTotalStudyTime();

        Assert.assertEquals(expected, actual, 0.0);
    }

    @Test
    public void testLecture() {
        Instructor instructor = new Instructor(Long.MIN_VALUE, "");
        Learner student1 = new Student(Long.MIN_VALUE, "A");
        Learner student2 = new Student(Long.MAX_VALUE, "B");
        Learner[] learners = {student1, student2};
        double expected = 3.0;
        instructor.lecture(learners, 6.0);
        double actual1 = student1.getTotalStudyTime();
        double actual2 = student2.getTotalStudyTime();

        Assert.assertEquals(actual1, actual2, 0.0);
        Assert.assertEquals(expected, actual1, 0.0);
    }
}
