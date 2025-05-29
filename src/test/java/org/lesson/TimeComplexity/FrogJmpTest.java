package org.lesson.TimeComplexity;

import junit.framework.TestCase;

public class FrogJmpTest extends TestCase {

    public void test1() {
        assertEquals(3, FrogJmp.solution(10, 85, 30));
    }
    public void test2() {
        assertEquals(3, FrogJmp.solution2(10, 85, 30));
    }
}