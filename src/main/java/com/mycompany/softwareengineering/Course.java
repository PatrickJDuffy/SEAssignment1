package com.mycompany.softwareengineering;

import org.joda.time.DateTime;
import java.util.ArrayList;

public class Course {

    private String name;
    public ArrayList<Student> students;
    public ArrayList<Module> modules;
    private DateTime startDate, endDate;

    public Course(String Name, DateTime startDate, DateTime endDate) {
        this.name = name;
        this.startDate = startDate;
        this.endDate = endDate;
        students = new ArrayList<Student>();
        modules = new ArrayList<Module>();
    }

    public void addStudent(Student s) {
        if (s != null) {
            if (!this.students.contains(s)) {
                this.students.add(s);
                s.setCourse(this);
            }
        }
    }

    public void addModule(Module m) {
        if (m != null) {
            if (!this.modules.contains(m)) {
                this.modules.add(m);
                m.setCourse(this);
            }
        }
    }
//
//    public ArrayList<Module> getmodules() {
//        return modules;
//    }

}
