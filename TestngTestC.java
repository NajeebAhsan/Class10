package org.example;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestngTestC {

    @Test(groups = {"group1"})
    public void Test5()
    {
        System.out.println("Test5 is executed");
    }

    @Test(groups = {"group2"})
    public void Test6()
    {
        System.out.println("Test6 is executed");
    }

    @Test(groups = {"group3"})
    public void Test7()
    {
        System.out.println("Test7 is executed");
    }

    @Test(groups = {"group1"})
    public void Test19()
    {
        System.out.println("Test19 is executed");
    }

    //This method will run before any test annotation everytime
//    @BeforeMethod
//    public void Test8()
//    {
//        System.out.println("Test8 is executed");
//    }
}
