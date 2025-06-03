package org.lesson.Sorting;

import junit.framework.TestCase;

public class DistinctTest extends TestCase {

    public void testSolution() {
        assertEquals(3, Distinct.solution(new int[]{2,1,1,2,3,1}));
    }
}