package io.zipcoder.interfaces;

public final class Students extends People {
private static final Students INSTANCE = new Students();
    private Students() {
        Student student1 = new Student(11L, "A");
        Student student2 = new Student(12L, "B");

        personList.add(student1);
        personList.add(student2);
    }

    public static Students getInstance() {
        return INSTANCE;
    }
}
