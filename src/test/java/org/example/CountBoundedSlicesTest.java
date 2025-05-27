package org.example;

import junit.framework.TestCase;

public class CountBoundedSlicesTest extends TestCase {

    public void test1() {
        assertEquals(9, CountBoundedSlices.solution(2, new int[]{3,5,7,6,3}));
    }

    public void test2() {
        assertEquals(2, CountBoundedSlices.solution(0, new int[]{1,1}));
    }
    public void test3() {
        assertEquals(1, CountBoundedSlices.solution(0, new int[]{1}));
    }
    public void test4() {
        assertEquals(3, CountBoundedSlices.solution(1, new int[]{0,1}));
    }
}

