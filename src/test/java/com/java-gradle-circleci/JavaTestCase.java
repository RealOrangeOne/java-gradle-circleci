package com.java_gradle_circleci;

import junit.framework.TestCase;

import static org.junit.Assert.*;

import com.java_gradle_circleci.Main;

public class JavaTestCase extends TestCase {
    protected int value1, value2;

    // assigning the values
    protected void setUp(){
        value1 = 3;
        value2 = 3;
    }

    // test method to add two values
    public void testAdd(){
        double result = value1 + value2;
        assertTrue(result == 6);
    }
    // test method to subtract two values
    public void testSubtract(){
        double result = value1 - value2;
        assertTrue(result == 0);
    }

    public void testReadFile() {
        try {
            String result = Main.readFile("README.md");
            assertNotEquals(result, "");
        } catch (Exception e) {
            assertTrue(false);
        }
    }

    public void testRandomNumber() {
        assertEquals(Main.getRandomNumber(), 4);
    }
}
