package org.example;

import junit.framework.TestCase;

public class ArrListLenTest extends TestCase {

    public void test1() {
        assertEquals(4, ArrListLen.solution(new int[]{1,4,-1,3,2}));
    }
    public void test2() {
        assertEquals(1, ArrListLen.solution(new int[]{-1}));
    }

    public void test3() {
        assertEquals(4, ArrListLen.solution2(new int[]{1,4,-1,3,2}));
    }
}