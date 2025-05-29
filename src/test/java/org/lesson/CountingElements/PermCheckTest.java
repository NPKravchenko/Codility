package org.lesson.CountingElements;

import junit.framework.TestCase;

public class PermCheckTest extends TestCase {

    public void test1() {
        assertEquals(1, PermCheck.solution(new int[]{4,1,3,2}));
    }
    public void test2() {
        assertEquals(0, PermCheck.solution(new int[]{4,1,3}));
    }
    public void test3() {
        assertEquals(0, PermCheck.solution(new int[]{100,98,99}));
    }
    public void test5() {
        assertEquals(1, PermCheck.solution(new int[]{1,2}));
    }
    public void test6() {
        assertEquals(0, PermCheck.solution(new int[]{1,1,1}));
    }
    public void test7() {
        assertEquals(0, PermCheck.solution(new int[]{1,1,1,2,2}));
    }
    public void test8() {
        assertEquals(0, PermCheck.solution(new int[]{1,3}));
    }
    public void test9() {
        assertEquals(0, PermCheck.solution(new int[]{1000000000, 1000000000-1}));
    }
    public void test10() {
        assertEquals(1, PermCheck.solution(new int[]{1}));
    }
    public void test11() {
        assertEquals(0, PermCheck.solution(new int[]{1000000000}));
    }
    public void test12() {
        assertEquals(0, PermCheck.solution(new int[]{1000000000, 1000000000}));
    }
    public void test13() {
        assertEquals(0, PermCheck.solution(new int[]{2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,33}));
    }
    public void test14() {
        assertEquals(0, PermCheck.solution(new int[]{-1,0}));
    }
    public void test15() {
        assertEquals(0, PermCheck.solution(new int[]{2}));
    }
}