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
    
    public String toString(){
        return "Module Name : " + this.name + "\nModule Code : " + this.iD + "\n";
    }

    //Adds course
    public void addCourse(Course c) {
        if (c != null) {
            this.courses.add(c);
        }
    }

    //Gets Course
    public ArrayList<Course> getCourses() {
        return this.courses;
    }

    //Removes Course
    public boolean removeCourse(Course c) {
        return this.courses.remove(c);
    }
    
    //adds a Student to list of Students attending
    public void addStudent(Student s) {
        if (s != null) {
            this.students.add(s);
        }
    }

    //removes a Student to list of Students attending
    public boolean removeStudent(Student s) {
        return this.students.remove(s);
    }
    
    //Returns list of Students attending
    public ArrayList<Student> getStudents() {
        return this.students;
    }
}
