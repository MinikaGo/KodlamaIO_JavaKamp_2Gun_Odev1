package com.company;

public class CourseManager {


    public void applyForCourse(Course course, Student student) {
        student.setCourse(course);
        System.out.println(student.name + " için başvuru alındı");

    }

    public void startCourse(Student student) {
        System.out.println(student.name + " için " + student.courseName + " kursu başladı");
    }

    public void getCourseCompletionRateForStudent(Student student) {
        System.out.println(student.name + " için " + student.courseCompletePercentage + "% Tamamlandı");

    }



}
