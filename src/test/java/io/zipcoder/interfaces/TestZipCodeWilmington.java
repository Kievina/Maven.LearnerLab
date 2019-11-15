package io.zipcoder.interfaces;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class TestZipCodeWilmington {
    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testHostLecture1() {
        Instructor teacher = Instructors.getInstance().findById(14L);
        Students students = Students.getInstance();
        Double numberOfHours = 12.0;
        Double expectedChange = 6.0;

        ZipCodeWilmington.hostLecture(teacher, numberOfHours);
        Double actualChange = numberOfHours / students.personList.size();

        Assert.assertEquals(expectedChange, actualChange, 0.0);
    }

    @Test
    public void testHostLecture2() {
        Long teacherId = 14L;
        Students students = Students.getInstance();
        Double numberOfHours = 20.0;
        Double expectedChange = 10.0;

        ZipCodeWilmington.hostLecture(teacherId, numberOfHours);
        Double actualChange = numberOfHours / students.personList.size();

        Assert.assertEquals(expectedChange, actualChange, 0.0);
    }

    @Test
    public void testGetStudyMap() {
        Student expectedS1 = Students.getInstance().findById(11L);
        Student expectedS2 = Students.getInstance().findById(12L);
        Double expectedTimeS1 = Students.getInstance().findById(11L).getTotalStudyTime();
        Double expectedTimeS2 = Students.getInstance().findById(12L).getTotalStudyTime();


        Assert.assertTrue(ZipCodeWilmington.getStudyMap().containsKey(expectedS1));
        Assert.assertTrue(ZipCodeWilmington.getStudyMap().containsKey(expectedS2));

        Assert.assertTrue(ZipCodeWilmington.getStudyMap().containsValue(expectedTimeS1));
        Assert.assertTrue(ZipCodeWilmington.getStudyMap().containsValue(expectedTimeS2));

    }

}
