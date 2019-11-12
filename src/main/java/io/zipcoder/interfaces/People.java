package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class People implements Iterable<Person> {
    List<Person> personList;

    public People(){
        this.personList = new ArrayList<Person>();
    }

    public void add(Person person) {
        personList.add(person);
    }

    public Person findById(Long id) {
        Person result = null;

        for (Person person : personList) {
            if (person.getId().equals(id)) {
                result = person;
            }
        }
        return result;
    }

    public Boolean contains(Person person) {
        return personList.contains(person);
    }

    public void remove(Person person) {
        personList.remove(person);
    }

    public void removeById(Long id) {
        personList.remove(findById(id));
    }

    public void removeAll() {
        personList.clear();
    }

    public int count() {
        return personList.size();
    }

    public Person[] toArray() {
        return personList.toArray(new Person[count()]);
    }


    public Iterator<Person> iterator() {
        return personList.iterator();
    }
}
