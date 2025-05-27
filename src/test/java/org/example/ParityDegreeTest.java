package org.example;

import junit.framework.TestCase;

public class ParityDegreeTest extends TestCase {

    public void test1() {
        assertEquals(3, ParityDegree.solution(24));
    }
    public void test2() {
        assertEquals(0, ParityDegree.solution(1));
    }
    public void test3() {
        assertEquals(8, ParityDegree.solution(256));
    }
    public void test4() {
        assertEquals(1, ParityDegree.solution(2));
    }
}