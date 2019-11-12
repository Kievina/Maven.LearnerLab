package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPeople {

    @Test
    public void testAdd() {
        People people = new People();
        Person person1 = new Person(11L, "A");
        Person person2 = new Person(12L, "B");
        people.add(person1);
        people.add(person2);

        Assert.assertTrue(people.contains(person1));
        Assert.assertTrue(people.contains(person2));
    }

    @Test
    public void testRemove() {
        People people = new People();
        Person person1 = new Person(11L, "A");
        Person person2 = new Person(12L, "B");
        people.add(person1);
        people.add(person2);
        int expected = 1;

        people.remove(person1);
        int actual = people.count();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testRemoveById() {
        People people = new People();
        Person person1 = new Person(11L, "A");
        Person person2 = new Person(12L, "B");
        people.add(person1);
        people.add(person2);
        int expected = 1;

        people.removeById(11L);
        int actual = people.count();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testFindById() {
        People people = new People();
        Person person1 = new Person(11L, "A");
        Person person2 = new Person(12L, "B");
        people.add(person1);
        people.add(person2);

        Person expected = person1;
        Person actual = people.findById(11L);

        Assert.assertEquals(expected, actual);
    }
}
