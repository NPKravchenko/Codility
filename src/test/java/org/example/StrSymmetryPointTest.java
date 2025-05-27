package org.example;

import junit.framework.TestCase;

public class StrSymmetryPointTest extends TestCase {

    public void test1() {
        assertEquals(3, StrSymmetryPoint.solution("racecar"));
    }
    public void test2() {
        assertEquals(-1, StrSymmetryPoint.solution("race"));
    }
    public void test3() {
        assertEquals(-1, StrSymmetryPoint.solution(""));
    }
}