package org.example;

import junit.framework.TestCase;

public class FloodDepthTest extends TestCase {

    public void test1() {
        assertEquals(2, FloodDepth.solution(new int[]{1,3,2,1,2,1,5,3}));
    }
    public void test2() {
        assertEquals(0, FloodDepth.solution(new int[]{1,1,1,1}));
    }
    public void test3() {
        assertEquals(2, FloodDepth.solution(new int[]{1,3,2,1,2,1,5,3,3,4,2}));
    }
    public void test4() {
        assertEquals(0, FloodDepth.solution(new int[]{1,2,3}));
    }
    public void test5() {
        assertEquals(0, FloodDepth.solution(new int[]{1,3,2}));
    }
    public void test6() {
        assertEquals(1, FloodDepth.solution(new int[]{1,3,2,3}));
    }
    public void test7() {
        assertEquals(1, FloodDepth.solution(new int[]{3,1,2}));
    }
    public void test8() {
        assertEquals(1, FloodDepth.solution(new int[]{2,1,3}));
    }
    public void test9() {
        assertEquals(6, FloodDepth.solution(new int[]{20, 4, 10, 1, 3}));
    }
    public void test10() {
        assertEquals(0, FloodDepth.solution(new int[]{5, 4}));
    }
}