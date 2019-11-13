package io.zipcoder.interfaces;

import com.sun.org.apache.bcel.internal.generic.InstructionComparator;

public final class Instructors extends People {
    private static final Instructors INSTANCE = new Instructors();

    private Instructors() {
        Instructor instructor1 = new Instructor(14L, "First");
        Instructor instructor2 = new Instructor(15L, "Second");
        personList.add(instructor1);
        personList.add(instructor2);
    }

    public static Instructors getInstance() {
        return INSTANCE;
    }
}
