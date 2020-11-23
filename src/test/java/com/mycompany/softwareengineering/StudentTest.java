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
public class StudentTest {

    public StudentTest() {
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
     * Test of getAge method, of class Student.
     */
    @Test
    public void testGetAge() {
        System.out.println("getAge");
        Student instance = new Student("Patrick", "Duffy", "1996-09-17T20:40:00+0000", 16742061);
        int expResult = 24;
        int result = instance.getAge();
        assertEquals(expResult, result);
    }

    /**
     * Test of setCourse method, of class Student.
     */
    @Test
    public void testSetCourse() {
        System.out.println("setCourse");
        Student instance = new Student("Patrick", "Duffy", "2013-09-18T20:40:00+0000", 16742061);
        Course c = new Course("CompSci", "GY350",  "2013-09-18", "2013-09-18");
        instance.setCourse(c);
        assertEquals(instance.getCourse(), c);
    }

    /**
     * Test of getCourse method, of class Student.
     */
    @Test
    public void testGetCourse() {
        System.out.println("getCourse");
        Student instance = new Student("Patrick", "Duffy", "2013-09-18T20:40:00+0000", 16742061);
        Course c = new Course("CompSci", "GY350",  "2013-09-18", "2013-09-18");
        instance.setCourse(c);
        Course result = instance.getCourse();
        assertEquals(c, result);

    }

    /**
     * Test of addModule method, of class Student.
     */
    @Test
    public void testAddModule() {
        System.out.println("addModule");
        Module m = new Module("Software Engineering", "CT411");
        Student instance = new Student("Patrick", "Duffy", "2013-09-18T20:40:00+0000", 16742061);
        instance.addModule(m);
        assertEquals(instance.getModules().get(0), m);
    }

    /**
     * Test of getModule method, of class Student.
     */
    @Test
    public void testGetModule() {
        System.out.println("getModule");
        Student instance = new Student("Patrick", "Duffy", "2013-09-18T20:40:00+0000", 16742061);
        Module m = new Module("Software Engineering", "CT411");
        instance.addModule(m);
        assertEquals(m, instance.getModules().get(0));
    }

    @Test
    public void testtoString() {
        System.out.println("toString");
        Student instance = new Student("Patrick", "Duffy", "2013-09-18T20:40:00+0000", 16742061);
        Module m1 = new Module("Software Engineering", "CT411");
        Module m2 = new Module("Information Retrieval", "CT422");
        instance.addModule(m1);
        instance.addModule(m2);
        instance.setCourse(new Course("CompSci", "GY350",  "2013-09-18", "2013-09-18"));
        assertEquals("-------------------------------------------------------\nName : Patrick Duffy\nID : DuPatrick7\nCourse(s) : \n\tCompSci\nModules : \n\tModule Name(Code) : Software Engineering (CT411)\n\tModule Name(Code) : Information Retrieval (CT422)\n", instance.toString());
    }
}
