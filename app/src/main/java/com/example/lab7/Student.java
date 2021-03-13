package com.example.lab7;

public class Student {

    String studentName;
    String studentLastName;
    int studentImage;

    public Student(String studentName, String studentLastName, int studentImage) {
        this.studentName = studentName;
        this.studentLastName = studentLastName;
        this.studentImage = studentImage;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getStudentLastName() {
        return studentLastName;
    }

    public int getStudentImage() {
        return studentImage;
    }
}