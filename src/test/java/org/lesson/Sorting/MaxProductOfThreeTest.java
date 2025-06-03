package org.lesson.Sorting;

import junit.framework.TestCase;

public class MaxProductOfThreeTest extends TestCase {

    public void test1() {
        assertEquals(60, MaxProductOfThree.solution2(new int[]{-3,1,2,-2,5,6}));
    }
    public void test2() {
        assertEquals(360, MaxProductOfThree.solution2(new int[]{-3,1,2,-20,5,6}));
    }
    public void test3() {
        assertEquals(300, MaxProductOfThree.solution2(new int[]{-3,1,2,20,5,3}));
    }
    public void test4() {
        assertEquals(20, MaxProductOfThree.solution2(new int[]{-3,1,2,2,5,2}));
    }
    public void test5() {
        assertEquals(6, MaxProductOfThree.solution2(new int[]{3,2,1}));
    }
}