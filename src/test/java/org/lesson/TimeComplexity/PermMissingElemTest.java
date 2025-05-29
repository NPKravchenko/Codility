package org.lesson.TimeComplexity;

import junit.framework.TestCase;

public class PermMissingElemTest extends TestCase {

    public void testSolution() {
        assertEquals(4, PermMissingElem.solution(new int[]{2,1,3,5}));
    }
}