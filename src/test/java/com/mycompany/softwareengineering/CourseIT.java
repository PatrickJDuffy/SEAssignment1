/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.softwareengineering;

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
public class CourseIT {
    
    public CourseIT() {
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
        
        assertSame(instance.students.get(0), s);
    }
    
}
