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

    //Adds Student to list of Students taking course
    public void addStudent(Student s) {
        if (s != null) //If the students list doesnt contain the Student, it is added
        {
            if (!this.students.contains(s)) {
                this.students.add(s);
                //The students Course variable is set to this Course instance 
                s.setCourse(this);
                //students modules are then updated by looping through course modules and adding to list
                for (int x = 0; x < modules.size(); x++) {
                    s.addModule(modules.get(x));
                }
            }
        }
    }
    
        
    public void removeStudent(Student s){
        if (s != null) {
            if (this.students.contains(s)) {
                //adds module and references this instance of course for its Course variable
                s.removeCourse(this);
                this.students.remove(s);
   
                if (!modules.isEmpty()) {
                    //Updates students Module list
                    for (int x = 0; x < modules.size(); x++) {
                        modules.get(x).removeStudent(s);
                    }
                }

            }
        }
    }

    //Adds a relevant module to Course
    public void addModule(Module m) {
        if (m != null) {
            if (!this.modules.contains(m)) {
                //adds module and references this instance of course for its Course variable
                this.modules.add(m);
                m.addCourse(this);
                if (!students.isEmpty()) {
                    //Updates students Module list
                    for (int x = 0; x < students.size(); x++) {
                        students.get(x).addModule(m);
                    }
                }

            }
        }
    }
    
    public void removeModule(Module m){
        if (m != null) {
            if (this.modules.contains(m)) {
                //adds module and references this instance of course for its Course variable
                m.removeCourse(this);
                this.modules.remove(m);
   
                if (!students.isEmpty()) {
                    //Updates students Module list
                    for (int x = 0; x < students.size(); x++) {
                        students.get(x).removeModule(m);
                    }
                }

            }
        }
    }

    //Returns relevant Modules for the Course
    public ArrayList<Module> getModules() {
        return modules;
    }

    //Returns list of Students taking Course
    public ArrayList<Student> getStudents() {
        return students;
    }

}
