package com.seleniumexpress.di;

public class Student {

    private int id;
    private String studentName;

    public Student() {
        System.out.println("Creating student class");
    }

    public Student(int id, String studentName) {
        System.out.println("Creating student class with id=" + id + " studentName=" + studentName);
        this.id = id;
        this.studentName = studentName;
    }

    public void displayStudentInfo() {
        System.out.println("Student name is: " + studentName + " id=" + id);
    }

    public void setId(int id) {
        System.out.println("Setting id to " + id);
        this.id = id;
    }

    public void setStudentName(String studentName) {
        System.out.println("Setting studentName to " + studentName);
        this.studentName = studentName;
    }
}
