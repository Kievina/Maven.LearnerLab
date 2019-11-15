package io.zipcoder.interfaces;

public class ConcretePeople extends People<Person>{

    public Person[] toArray() {
        return personList.toArray(new Person[0]);
    }
}
