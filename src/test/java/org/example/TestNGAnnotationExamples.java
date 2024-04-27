package org.example;

import org.testng.annotations.*;
import org.testng.annotations.Test;

public class TestNGAnnotationExamples {

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("Before Suite - Executed once before all tests in the suite.");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("Before Test - Executed before each test in the suite.");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("Before Class - Executed once before the first test method in the current class.");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("Before Method - Executed before each test method.");
    }

    @Test(priority = 0)
    public void testMethod1() {
        System.out.println("Test Method 1");
    }

    @Test(priority = 1)
    public void testMethod2() {
        System.out.println("Test Method 2");
    }

    @Test(priority = 2)
    public void testMethod3() {
        System.out.println("Test Method 3");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("After Method - Executed after each test method.");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("After Class - Executed once after all test methods in the current class.");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("After Test - Executed after each test in the suite.");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("After Suite - Executed once after all tests in the suite.");
    }

}
