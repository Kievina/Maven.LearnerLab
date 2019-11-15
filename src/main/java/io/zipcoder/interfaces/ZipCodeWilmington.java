package io.zipcoder.interfaces;

import java.util.HashMap;
import java.util.Map;

public class ZipCodeWilmington {
    private static final Students students = Students.getInstance();
    private static final Instructors instructors = Instructors.getInstance();
    private static final ZipCodeWilmington INSTANCE = new ZipCodeWilmington();

    private ZipCodeWilmington() {

    }

    public static void hostLecture(Teacher teacher, double numberOfHours) {
        teacher.lecture(students.toArray(), numberOfHours);

    }

    public static void hostLecture(Long id, double numberOfHours) {
        instructors.findById(id).lecture(students.toArray(), numberOfHours);

    }

    public static Map<Student, Double> getStudyMap() {
        Map<Student, Double> map = new HashMap<Student, Double>();
        for (Person person : students) {
            Student student = (Student) person;
            map.put(student, student.getTotalStudyTime());
        }
        return map;
    }

    public static ZipCodeWilmington getInstance() {
        return INSTANCE;
    }
}
