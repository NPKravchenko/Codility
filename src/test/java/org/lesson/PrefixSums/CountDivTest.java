package org.lesson.PrefixSums;

import junit.framework.TestCase;

public class CountDivTest extends TestCase {

    public void test1() {
        assertEquals(3,CountDiv.solution(6,11,2));
    }
    public void test2() {
        assertEquals(3,CountDiv.solution(2,10,3));
    }
    public void test3() {
        assertEquals(20,CountDiv.solution(11,345,17));
    }
    public void test4() {
        assertEquals(0,CountDiv.solution(1,1,11));
    }
    public void test5() {
        assertEquals(4,CountDiv.solution(6,23,4));
    }
    public void test6() {
        assertEquals(3,CountDiv.solution(0,2000000000,1000000000));
    }
}