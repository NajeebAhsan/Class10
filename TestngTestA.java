package org.example;

import org.testng.annotations.*;

public class TestngTestA {

    @Test
    public void test1()
    {
        System.out.println("Test1 executed");
    }

    //This will run after every test annotation everytime
    @AfterMethod
    public void test9()
    {
        System.out.println("Test9 executed");
    }

    //It will run first before any test annotation
    @BeforeClass
    public void test10()
    {
        System.out.println("Test10 executed");
    }

    //It will run at the end of test annotation
    @AfterClass
    public void test11()
    {
        System.out.println("Test11 executed");
    }

    @Test
    public void test12()
    {
        System.out.println("Test12 executed");
    }
}
