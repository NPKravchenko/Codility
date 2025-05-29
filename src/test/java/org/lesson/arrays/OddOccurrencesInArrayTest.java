package org.lesson.arrays;

import junit.framework.TestCase;

public class OddOccurrencesInArrayTest extends TestCase {

    public void test1() {
        assertEquals(7, OddOccurrencesInArray.solution(new int[]{9,3,9,3,9,7,9}));
    }
    public void test2() {
        assertEquals(5, OddOccurrencesInArray.solution(new int[]{9,3,9,3,7,7,5}));
    }
}