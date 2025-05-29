package org.lesson.TimeComplexity;

import junit.framework.TestCase;

public class TapeEquilibriumTest extends TestCase {

    public void test1() {
        assertEquals(1,TapeEquilibrium.solution(new int[]{3,1,2,4,3}) );
    }
    public void test2() {
        assertEquals(2000,TapeEquilibrium.solution(new int[]{-1000, 1000}) );
    }
}