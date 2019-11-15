package io.zipcoder.interfaces;

import java.util.HashMap;
import java.util.Map;

public final class ZipCodeWilmington extends People {
    private static final Students students = Students.getInstance();
    private static final Instructors instructors = Instructors.getInstance();
    private static final ZipCodeWilmington INSTANCE = new ZipCodeWilmington();
    private Map<Student, Double> map;

    private ZipCodeWilmington() {

    }

    public void hostLecture(Teacher teacher, double numberOfHours) {
        int numberOfLearners = students.personList.size();
//        teacher.lecture(Students.getInstance().toArray(), numberOfHours);
    }

    public void hostLecture(Long id, double numberOfHours) {
        int numberOfLearners = students.personList.size();
        Teacher teacher = (Teacher) instructors.findById(id);
        teacher.lecture(students.personList.toArray(new Learner[numberOfLearners]), numberOfHours);

    }

    public Map<Student, Double> getStudyMap() {
        map = new HashMap<Student, Double>();
        for (Person student : students) {
            //map.put(student, student.getTotalStudyTime());
        }
        return map;
    }
}
