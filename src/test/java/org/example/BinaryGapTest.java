package org.example;

import junit.framework.TestCase;

public class BinaryGapTest extends TestCase {

    public void test1() {
        assertEquals(5, BinaryGap.solution(1041) );
    }
    public void test2() {
        assertEquals(2, BinaryGap.solution(9) );
    }
    public void test3() {
        assertEquals(4, BinaryGap.solution(529 ) );
    }
    public void test4() {
        assertEquals(1, BinaryGap.solution(20  ) );
    }
    public void test5() {
        assertEquals(0, BinaryGap.solution(32  ) );
    }
}