package com.mycompany.softwareengineering;

import org.joda.time.DateTime;
import java.util.ArrayList;

public class Course {

    private String name;
    private ArrayList<Student> students;
    private ArrayList<Module> modules;
    private final DateTime startDate, endDate;

    public Course(String name, DateTime startDate, DateTime endDate) {
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

    public ArrayList<Module> getModules() {
        return modules;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

}
