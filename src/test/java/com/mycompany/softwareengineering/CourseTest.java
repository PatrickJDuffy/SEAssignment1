/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.softwareengineering;

import org.joda.time.DateTime;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author duffy
 */
public class CourseTest {

    public CourseTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of addStudent method, of class Course.
     */
    @Test
    public void testAddStudent() {
        System.out.println("addStudent");
        Student s = new Student("Patrick", "Duffy", "2013-09-18T20:40:00+0000", 16742061);
        Course instance = new Course("CompSci", "GY350", "2013-09-18", "2013-09-18");
        instance.addStudent(s);
        System.out.println(instance.toString() + s.toString());
        assertSame(instance.getStudents().get(0), s);
    }

    /**
     * Test of getModules method, of class Course.
     */
    @Test
    public void testGetModules() {
        System.out.println("getmodules");
        Module m = new Module("Software Engineering", "CT4321");
        Course instance = new Course("CompSci", "GY350", "2013-09-18", "2013-09-18");
        instance.addModule(m);
        assertEquals(m, instance.getModules().get(0));
    }

    @Test
    public void testAddModule() {
        System.out.println("addModule");
        Module m = new Module("Software Engineering", "CT411");
        Course instance = new Course("CompSci", "GY350", "2013-09-18", "2013-09-18");
        instance.addModule(m);
        assertSame(instance.getModules().get(0), m);
    }

    @Test
    public void testtoString() {
        System.out.println("toString");
        Module m = new Module("Software Engineering", "CT411");
        Course instance = new Course("CompSci", "GY350", "2013-09-18", "2013-09-18");
        Student s = new Student("Patrick", "Duffy", "2013-09-18T20:40:00+0000", 16742061);
        instance.addModule(m);
        instance.addStudent(s);
        assertEquals(instance.toString(), "\n------------------------------------------------------------------\n"
                + "Course (Code): CompSci (GY350)\n"
                + "Modules : \n\tModule Name(Code) : Software Engineering (CT411)"
                + "\nStudents : -------------------------------------------------------"
                + "\nName : Patrick Duffy\n"
                + "ID : DuPatrick7\n"
                + "Course(s) : \n"
                + "\tCompSci\n"
                + "Modules : \n"
                + "\tModule Name(Code) : Software Engineering (CT411)\n");
    }

    /**
     * Test of removeStudent method, of class Course.
     */
    @Test
    public void testRemoveStudent() {
        System.out.println("removeStudent");
        Course instance = new Course("CompSci", "GY350", "2013-09-18", "2013-09-18");
        Student s = new Student("Patrick", "Duffy", "2013-09-18T20:40:00+0000", 16742061);
        instance.addStudent(s);
        instance.removeStudent(s);
        assertEquals(instance.getStudents().contains(s), false);
    }

    /**
     * Test of removeModule method, of class Course.
     */
    @Test
    public void testRemoveModule() {
        System.out.println("removeModule");
        Module m = new Module("Software Engineering", "CT411");
        Course instance = new Course("CompSci", "GY350", "2013-09-18", "2013-09-18");
        instance.addModule(m);
        instance.removeModule(m);
        assertEquals(instance.getModules().contains(m), false);
    }

    /**
     * Test of getStudents method, of class Course.
     */
    @Test
    public void testGetStudents() {
        System.out.println("getStudents");
        Course instance = new Course("CompSci", "GY350", "2013-09-18", "2013-09-18");
        Student s1 = new Student("Patrick", "Duffy", "2013-09-18T20:40:00+0000", 16742061);
        Student s2 = new Student("Patrick", "Duffy", "2013-09-18T20:40:00+0000", 16742061);
        Student s3 = new Student("Patrick", "Duffy", "2013-09-18T20:40:00+0000", 16742061);
        ArrayList<Student> expResult = new ArrayList<Student>();
        expResult.add(s1);
        expResult.add(s2);
        expResult.add(s3);
        instance.addStudent(s1);
        instance.addStudent(s2);
        instance.addStudent(s3);
        ArrayList<Student> result = instance.getStudents();
        assertEquals(expResult, result);
    }

    /**
     * Test of getCourse method, of class Course.
     */
    @Test
    public void testGetCourse() {
        System.out.println("getCourse");
        Course instance = new Course("CompSci", "GY350", "2013-09-18", "2013-09-18");
        String expResult = "\n\tCompSci";
        String result = instance.getCourse();
        assertEquals(expResult, result);
    }
}
