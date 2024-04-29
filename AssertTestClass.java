package org.example;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class AssertTestClass { // Renamed the class to avoid conflict with Assert import
    @Test
    public void test1() {
        int a = 10;
        int b = 11;
        int result;
        result = a + b;

        assertEquals(result, 21, "Not expected result"); // Changed the expected result to 21
    }
}
