package io.zipcoder.interfaces;

public final class Students extends People<Student> {
private static final Students INSTANCE;
    private Students() {

    }

    public Student[] toArray() {
        return personList.toArray(new Student[0]);
    }

    static Students getInstance() {
        return INSTANCE;
    }

    static {
        INSTANCE = new Students();
        Student student1 = new Student(11L, "A");
        Student student2 = new Student(12L, "B");

        INSTANCE.add(student1);
        INSTANCE.add(student2);
    }
}
