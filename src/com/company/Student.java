package com.company;

public class Student {

    int id;
    String name;
    String surname;
    String email;
    String nationalID;
    String birthDate;
    String courseName;
    int courseCompletePercentage;

    public Student(
            int id,
            String name,
            String surname,
            String email,
            String nationalID,
            String birthDate,
            String courseName,
            int courseCompletePercentage){
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.nationalID = nationalID;
        this.birthDate = birthDate;
        this.courseCompletePercentage = courseCompletePercentage;
        this.courseName = courseName;
    };

    public Student() {

    }

    public void setCourse(Course course) {
        this.courseName = course.courseName;
    }
}