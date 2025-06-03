package org.lesson.Sorting;

import junit.framework.TestCase;

public class TriangleTest extends TestCase {

    public void test1() {
        assertEquals(1, Triangle.solution2(new int []{10,2,5,1,8,20}));
    }
    public void test2() {
        assertEquals(0, Triangle.solution2(new int []{10,50,5,1}));
    }
    public void test3() {
        assertEquals(1, Triangle.solution2(new int []{2147483647,2147483646,2147483645,0}));
    }
}