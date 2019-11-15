package io.zipcoder.interfaces;

public final class Instructors extends People<Instructor> {
    private static Instructors INSTANCE;

    private Instructors() {

    }

    public Instructor[] toArray() {
        return personList.toArray(new Instructor[0]);
    }

    static Instructors getInstance() {
        return INSTANCE;
    }

    static {
        INSTANCE = new Instructors();
        Instructor instructor1 = new Instructor(14L, "First");
        Instructor instructor2 = new Instructor(15L, "Second");
        INSTANCE.add(instructor1);
        INSTANCE.add(instructor2);
    }
}
