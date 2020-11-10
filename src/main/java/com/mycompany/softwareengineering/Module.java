package com.mycompany.softwareengineering;

import java.util.ArrayList;

public class Module {

    private String name, iD;
    private ArrayList<Student> students;
    private ArrayList<Course> courses;

    public Module(String name, String iD) {
        this.name = name;
        this.iD = iD;
        this.students = new ArrayList<Student>();
        this.courses = new ArrayList<Course>();
    }

    public void addCourse(Course c) {
        if (c != null) {
            this.courses.add(c);
        }
    }

    public ArrayList<Course> getCourses() {
        return this.courses;
    }

    public boolean removeCourse(Course c) {
        return this.courses.remove(c);
    }
    

    public void addStudent(Student s) {
        if (s != null) {
            this.students.add(s);
        }
    }

    public boolean removeStudent(Student s) {
        return this.students.remove(s);
    }

    public ArrayList<Student> getStudents() {
        return this.students;
    }
}
