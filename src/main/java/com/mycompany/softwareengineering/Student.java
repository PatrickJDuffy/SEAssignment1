package com.mycompany.softwareengineering;

import org.joda.time.DateTime;
import org.joda.time.Years;
import java.util.ArrayList;

/**
 *
 * @author duffy
 */
public class Student {

    private String fName, lName, username;
    private int iD;
    private DateTime dOB;
    private ArrayList<Module> modules;
    private Course course;

    public Student(String fName, String lName, String dOB, int iD) {
        this.fName = fName;
        this.lName = lName;
        this.dOB = DateTime.parse(dOB);
        this.username = lName.substring(0, 2) + fName + Integer.toString(this.getAge());
        this.modules = new ArrayList<Module>();
        this.iD = iD;
    }

    public Student(String fName, String lName, String dOB, int iD, Course course) {
        //Course overloaded constructor, takes an additional course parameter
        this.fName = fName;
        this.lName = lName;
        this.dOB = DateTime.parse(dOB);
        this.username = lName.substring(0, 2) + fName + Integer.toString(getAge());
        this.modules = new ArrayList<Module>();
        this.iD = iD;
        this.course = course;
    }

    @Override
    public String toString() {
        String ms = "";
        for (int x = 0; x < modules.size(); x++) {
            ms = ms.concat(modules.get(x).toString());
        }

        return "-------------------------------------------------------\n"
                + "Name : " + fName + " " + lName + "\n"
                + "ID : " + iD + "\n"
                + "Course(s) : " + course.getCourse() + "\n"
                + "Modules : " + ms + "\n";
    }

    //Returns Student ID 
    public int getID() {
        return this.iD;
    }

    //Returns Student Age from DOB
    public int getAge() {
        //getAge Function isntead of variable
        Years age = Years.yearsBetween(dOB, DateTime.now());
        return age.getYears();
    }

    //Sets Students Course
    public void setCourse(Course c) {
        this.course = c;
    }

    public Course getCourse() {
        return this.course;
    }

    public void addModule(Module m) {
        this.modules.add(m);
    }

    public ArrayList<Module> getModules() {
        return this.modules;
    }

    public void removeModule(Module m) {
        this.modules.remove(m);
    }

    public void removeCourse(Course c) {
        if (this.course == c) {
            this.course = null;
        }
    }
}
