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
        Student s = new Student("Patrick Duffy", "2013-09-18T20:40:00+0000");
        Course instance = new Course("CompSci", new DateTime("2013-09-18T20:40:00+0000"), new DateTime("2013-09-18T20:40:00+0000"));
        instance.addStudent(s);
        System.out.println(instance.toString() + s.toString());
        assertSame(instance.students.get(0), s);
    }
    
    /**
     * Test of getmodules method, of class Course.
     */
    @Test
    public void testGetmodules() {
        System.out.println("getmodules");
        Module expResult = new Module("Software Engineering", "CT4321");
        Course instance = new Course("CompSci", new DateTime("2013-09-18T20:40:00+0000"), new DateTime("2013-09-18T20:40:00+0000"));
        instance.addModule(expResult);
        //ArrayList<Module> expList = new ArrayList<Module>();
        //expList.add(new Module("Software Engineering", "CT4321"));
        ArrayList<Module> result = instance.getmodules();
        assertEquals(expResult, result.get(0));
    }
    @Test
    public void testAddModule() {
        System.out.println("addModule");
        Module m = new Module("Software Engineering", "CT411");
        Course instance = new Course("CompSci", new DateTime("2013-09-18T20:40:00+0000"), new DateTime("2013-09-18T20:40:00+0000"));
        instance.addModule(m);
        assertSame(instance.modules.get(0), m);
    }
}
