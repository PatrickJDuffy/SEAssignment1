package com.mycompany.softwareengineering;

import org.joda.time.DateTime;
import java.util.ArrayList;

public class Course {

    private String name;
    public ArrayList<Student> students;
    public ArrayList<Module> modules;
    private final DateTime startDate, endDate;

    public Course(String Name, DateTime startDate, DateTime endDate) {
        this.name = name;
        this.startDate = startDate;
        this.endDate = endDate;
        students = new ArrayList<>();
        modules = new ArrayList<>();
    }

    public void addStudent(Student s) {
        if (s != null) {
            if (!this.students.contains(s)) {
                this.students.add(s);
                s.setCourse(this);
                for (int x = 0; x < modules.size(); x++) {
                    s.addModule(modules.get(x));
                }
            }
        }
    }

    public void addModule(Module m) {
        if (m != null) {
            if (!this.modules.contains(m)) {
                this.modules.add(m);
                m.addCourse(this);
            }
        }
    }

    public ArrayList<Module> getmodules() {
        return modules;
    }

}
