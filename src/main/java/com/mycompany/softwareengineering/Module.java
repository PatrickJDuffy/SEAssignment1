package com.mycompany.softwareengineering;

import java.util.ArrayList;

public class Module {

    private String name, iD;
    public ArrayList<Student> students;
    public ArrayList<Course> courses;

    public Module(String name, String iD) {
        this.name = name;
        this.iD = iD;
        students = new ArrayList<Student>();
        courses = new ArrayList<Course>();
    }

    public void addCourse(Course c) {
        if (!(c == null)) {
            this.courses.add(c);
        }
    }

    public void addStudent(Student s) {
        if (!(s == null)) {
            this.students.add(s);
        }
    }
}
