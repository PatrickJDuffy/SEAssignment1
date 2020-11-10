package com.mycompany.softwareengineering;

import org.joda.time.DateTime;
import org.joda.time.Years;
import java.util.ArrayList;

/**
 *
 * @author duffy
 */
public class Student {

    private String name, username;
    private int iD;
    private DateTime dOB;
    private ArrayList<Module> modules;
    private Course course;

    public Student(String name, String dOB, int iD) {
        this.name = name;
        this.dOB = DateTime.parse(dOB);
        this.username = name + Integer.toString(this.getAge());
        this.modules = new ArrayList<Module>();
        this.iD = iD;
    }

    public Student(String name, String dOB, int iD, Course course) {
        //Course overloaded constructor, takes an additional course parameter
        this.name = name;
        this.dOB = DateTime.parse(dOB);
        this.username = name + Integer.toString(getAge());
        this.modules = new ArrayList<Module>();
        this.iD = iD;
        this.course = course;
    }
    
    public int getID(){
        return this.iD;
    }

    public int getAge() {
        //getAge Function isntead of variable
        Years age = Years.yearsBetween(dOB, DateTime.now());
        return age.getYears();
    }

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
}
