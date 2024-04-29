package org.example;

import org.testng.annotations.Test;

public class TestD {
    @Test(priority=4)
    public void test15() {
        System.out.println("priority 15");}
    @Test(priority=6)
    public void test16() {
        System.out.println("priority 16");
    }

    @Test(priority=5)
    public void test17() {
        System.out.println("priority 17");
    }

    @Test(priority=7)
    public void test18() {
        System.out.println("priority 18");
    }
}

