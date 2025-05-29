package org.lesson.PrefixSums;

import junit.framework.TestCase;

public class PassingCarsTest extends TestCase {

    public void test1() {
        assertEquals(5, PassingCars.solution(new int[]{0,1,0,1,1}));
    }
    public void test2() {
        assertEquals(5, PassingCars.solution2(new int[]{0,1,0,1,1}));
    }
}