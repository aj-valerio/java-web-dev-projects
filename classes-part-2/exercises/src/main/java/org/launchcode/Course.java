package org.launchcode;

import java.util.ArrayList;
import java.util.Objects;

public class Course {
    private String topic;
    private Teacher instructor;
    private ArrayList<Student> enrolledStudents;

    // TODO: Add your custom 'toString' method here. Make sure it returns a well-formatted String rather than
    //  just the class fields.

    @Override
    public String toString() {
        return instructor + " will be teaching " + topic + " this semester.";
    }


    // TODO: Add your custom 'equals' method here. Consider which fields should match in order to call two
    //  Course objects equal.

    @Override
    public boolean equals(Object aCourse) {
        if (this == aCourse) return true;
        if (aCourse == null || getClass() != aCourse.getClass()) return false;
        Course course = (Course) aCourse;
        return Objects.equals(topic, course.topic) && Objects.equals(instructor, course.instructor);
    }
}
