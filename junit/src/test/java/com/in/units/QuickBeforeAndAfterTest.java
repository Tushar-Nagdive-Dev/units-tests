package com.in.units;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class QuickBeforeAndAfterTest {

    @BeforeClass
    public static void beforeClass(){
        System.out.println("Before Class");
    }

    @Before
    public void setupBefore() {
        System.out.println("Before Test executes");
    } 

    @AfterClass
    public static void afterClass() {
        System.out.println("After Class");
    }

    @After
    public void setupAfter() {
        System.out.println("After Test executes");
    }

    @Test
    public void test1() {
        System.out.println("test 1 is executes");
    }

    @Test
    public void test2() {
        System.out.println("test 2 is executes");
    }
}
