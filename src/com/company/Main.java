package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Student student1 = new Student(
                1,
                "Ümit",
                "Sinanoğlu",
                "usinanoglu@gmail.com",
                "12345678901",
                "12/12/2005",
                "Java",
                1
        );

        Student student2 = new Student();

        student2.id = 1;
        student2.name = "Eren";
        student2.surname = "Tunçyürek";
        student2.email = "erentuncyurek@gmail.com";
        student2.nationalID = "123456799";
        student2.birthDate = "30/09/2009";
        student2.courseName = "VB.NET";
        student2.courseCompletePercentage = 90;

        Course course1 = new Course();
        course1.courseName = "Java";

        Course course2 = new Course();
        course2.courseName = "C# .NET";

        CourseManager courseManager = new CourseManager();
        courseManager.applyForCourse(course1, student1);
        courseManager.startCourse(student1);

        courseManager.applyForCourse(course2, student2);
        courseManager.startCourse(student2);

    }
}