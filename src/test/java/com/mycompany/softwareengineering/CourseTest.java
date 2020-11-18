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
}
