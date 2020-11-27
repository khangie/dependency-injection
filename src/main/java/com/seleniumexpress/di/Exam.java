package com.seleniumexpress.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam {

    public static void main(String[] args) {

        /*
         * Setter injection
         */

        // Old way (hardcoded)
        Student student1 = new Student();
        student1.setStudentName("test1");
        student1.displayStudentInfo();

        // New way
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Student student2 = context.getBean("student-setter-injected", Student.class);
        student2.displayStudentInfo();

        /*
         * Constructor injection
         */

        // Old way
        Student student3 = new Student(1, "test3");
        student3.displayStudentInfo();

        // New way
        Student student4 = context.getBean("student-constructor-injected", Student.class);
        student4.displayStudentInfo();
    }

}
