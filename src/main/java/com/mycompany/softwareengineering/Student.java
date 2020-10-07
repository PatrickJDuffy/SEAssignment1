
package com.mycompany.softwareengineering;

/**
 *
 * @author duffy
 */
public class Student {
    
private String name, dOB, username, course;
private int age, iD;
//Just have getAge function instead of having variable
public Student(String name, String dOB, String course){

this.name = name;
this.dOB = dOB;
this.course = course;

username = name + dOB;
}

//private int getAge(String dOB){
//StringTokenizer s;
//
//}
}
