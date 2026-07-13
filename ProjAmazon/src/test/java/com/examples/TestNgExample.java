package com.examples;

import org.testng.annotations.*;

public class TestNgExample {
	
    @BeforeSuite
    public void beforeSuite() {
        System.out.println("BeforeSuite");
    }

    @BeforeTest //in xml test tag based it will run - mostly chrome, edge, firefox will run contionously (one after one) so that it is used
    public void beforeTest() {
        System.out.println("BeforeTest");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("BeforeClass");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("BeforeMethod");
    }

    @Test
    public void test1() {
        System.out.println("Test1");
    }

    @Test
    public void test2() {
        System.out.println("Test2");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("AfterMethod");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("AfterClass");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("AfterTest");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("AfterSuite");
    }

}
