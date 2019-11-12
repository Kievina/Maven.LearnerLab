package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPerson {

    @Test
    public void testConstructor(){
        Person person = new Person(Long.MIN_VALUE,"PersonName");
        Long expectedId = Long.MIN_VALUE;
        String expectedName = "PersonName";

        Long actualId = person.getId();
        String actualName = person.getName();

        Assert.assertEquals(expectedId, actualId);
        Assert.assertEquals(expectedName, actualName);

    }

    @Test
    public void testSetName(){
        Person person = new Person(Long.MIN_VALUE,"");
        person.setName("Kievina");
        String expectedName = "Kievina";

        String actualName = person.getName();

        Assert.assertEquals(expectedName, actualName);
    }

}
