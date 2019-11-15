package io.zipcoder.interfaces;

public enum Educator implements Teacher {

    INSTRUCTOR1(21L, "Instructor1"),
    INSTRUCTOR2(22L, "Instructor2");

    private Instructor instructor;
    private Double timeWorked = 0.0;

    Educator(Long id, String name) {
        this.instructor = new Instructor(id, name);
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }

    public void setTimeWorked(Double timeWorked) {
        this.timeWorked = timeWorked;
    }

    public void teach(Learner learner, double numberOfHours) {
        timeWorked += numberOfHours;
        learner.learn(numberOfHours);
    }

    public void lecture(Learner[] learners, double numberOfHours) {
        Double numberOfHoursPerLearner = numberOfHours / learners.length;
        for (Learner learner : learners) {
            teach(learner, numberOfHoursPerLearner);
        }
    }

    public Double getTimeWorked() {
        return timeWorked;
    }

}
