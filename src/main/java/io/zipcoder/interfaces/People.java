package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class People<E extends Person> implements Iterable<E> {
    List<E> personList;

    public People(){
        this.personList = new ArrayList<E>();
    }

    public void add(E person) {
        personList.add(person);
    }

    public E findById(Long id) {
        E result = null;

        for (E person : personList) {
            if (person.getId().equals(id)) {
                result = person;
            }
        }
        return result;
    }

    public Boolean contains(E person) {
        return personList.contains(person);
    }

    public void remove(E person) {
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

    public abstract E[] toArray();


    public Iterator<E> iterator() {
        return personList.iterator();
    }
}
