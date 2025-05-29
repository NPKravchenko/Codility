package org.lesson.CountingElements;

import junit.framework.TestCase;

public class FrogRiverOneTest extends TestCase {

    public void test1() {
        assertEquals(6,FrogRiverOne.solution(5,new int[]{1,3,1,4,2,3,5,4}));
    }
    public void test2() {
        assertEquals(-1,FrogRiverOne.solution(10,new int[]{1,3,1,4,2,3,5,4}));
    }
    public void test3() {
        assertEquals(2,FrogRiverOne.solution(3,new int[]{1,3,2}));
    }
}