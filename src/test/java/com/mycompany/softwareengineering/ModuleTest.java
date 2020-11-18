/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.softwareengineering;

import java.util.ArrayList;
import org.joda.time.DateTime;
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
public class ModuleTest {

    public ModuleTest() {
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

    @Test
    public void testAddCourse() {
        System.out.println("addCourse");
        Module instance = new Module("Software Engineering", "CT411");
        Course c = new Course("CompSci", "GY350", "2013-09-18", "2013-09-18");
        instance.addCourse(c);
        assertEquals(c, instance.getCourses().get(0));
    }

    @Test
    public void testGetCourses() {
        System.out.println("getCourses");
        Module instance = new Module("Software Engineering", "CT411");
        Course c = new Course("CompSci", "GY350", "2013-09-18", "2013-09-18");
        ArrayList<Course> expResult = new ArrayList<Course>();
        expResult.add(c);
        expResult.add(c);
        expResult.add(c);
        instance.addCourse(c);
        instance.addCourse(c);
        instance.addCourse(c);
        assertEquals(expResult, instance.getCourses());
    }

    @Test
    public void testRemoveCourse() {
        System.out.println("removeCourse");
        Course c = new Course("CompSci", "GY350", "2013-09-18", "2013-09-18");
        Module instance = new Module("Software Engineering", "CT411");
        instance.addCourse(c);
        boolean result = instance.removeCourse(c);
        assertEquals(true, result);
    }

    @Test
    public void testAddStudent() {
        System.out.println("addStudent");
        Student s = new Student("Patrick", "Duffy", "1996-09-17T20:40:00+0000", 16742061);
        Module instance = new Module("Software Engineering", "CT411");
        instance.addStudent(s);
        assertEquals(instance.getStudents().get(0), s);
    }

    @Test
    public void testRemoveStudent() {
        System.out.println("removeStudent");
        Student s = new Student("Patrick", "Duffy", "1996-09-17T20:40:00+0000", 16742061);
        Module instance = new Module("Software Engineering", "CT411");
        instance.addStudent(s);
        boolean result = instance.removeStudent(s);
        assertEquals(true, result);
    }

    @Test
    public void testGetStudents() {
        System.out.println("getStudents");
        Student s = new Student("Patrick", "Duffy", "1996-09-17T20:40:00+0000", 16742061);
        Module instance = new Module("Software Engineering", "CT411");
        instance.addStudent(s);
        assertEquals(s, instance.getStudents().get(0));
    }

    @Test
    public void testtoString() {
        System.out.println("toString");
        Module instance = new Module("Software Engineering", "CT411");
        assertEquals("\tModule Name(Code) : Software Engineering (CT411)\n", instance.toString());
    }
}
