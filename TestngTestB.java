package org.example;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestngTestB {

    @AfterTest
    public void Test2()
    {
        System.out.println("Test2 is executed");
    }

    @Test
    public void Test3()
    {
        System.out.println("Test3 is executed");
    }

    @BeforeTest
    public void Test4()
    {
        System.out.println("Test4 is executed");
    }
}
