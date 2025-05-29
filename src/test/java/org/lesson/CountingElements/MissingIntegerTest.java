package org.lesson.CountingElements;

import junit.framework.TestCase;

public class MissingIntegerTest extends TestCase {

    public void test1() {
        assertEquals(1, MissingInteger.solution(new int[]{-1,-3}));
    }
    public void test2() {
        assertEquals(4, MissingInteger.solution(new int[]{1,2,3}));
    }
    public void test3() {
        assertEquals(5, MissingInteger.solution(new int[]{1,3,6,4,1,2}));
    }
    public void test4() {
        assertEquals(2, MissingInteger.solution(new int[]{1}));
    }
    public void test5() {
        assertEquals(1, MissingInteger.solution(new int[]{1000000,1000000, 999999,999997}));
    }
    public void test6() {
        assertEquals(2, MissingInteger.solution(new int[]{1,1,1}));
    }
    public void test7() {
        assertEquals(3, MissingInteger.solution(new int[]{-1,1,2,4}));
    }
    public void test8() {
        assertEquals(1, MissingInteger.solution(new int[]{4}));
    }
}