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
    private int age, iD;
    private DateTime dOB;
    private ArrayList<Module> modules;
    private Course course;
//Just have getAge function instead of having variable

    public Student(String name, String dOB, String course) {
//Course
        this.name = name;
        this.dOB = DateTime.parse(dOB);
        username = name + dOB;
    }

    public Student(String name, String dOB) {

        this.name = name;

        this.dOB = DateTime.parse(dOB);

        username = name + dOB;
    }

    public int getAge() {
        Years age = Years.yearsBetween(dOB, DateTime.now());
        return age.getYears();
    }

    public void setCourse(Course c) {
        course = c;
    }

    public void addModule(Module m) {
        modules.add(m);
    }
}
