package org.example;

import junit.framework.TestCase;

public class ThreeLettersTest extends TestCase {

    public void test1() {
        assertEquals("aabaabab", ThreeLetters.solution(5,3));
    }
    public void test2() {
        assertEquals("ababab", ThreeLetters.solution(3,3));
    }
    public void test3() {
        assertEquals("bbabb", ThreeLetters.solution(1,4));
    }
    public void test4() {
        assertEquals("ababababab", ThreeLetters.solution(5,5));
    }
    public void test5() {
        assertEquals("ab", ThreeLetters.solution(1,1));
    }
    public void test6() {
        assertEquals("aaba", ThreeLetters.solution(3,1));
    }

    public void test11() {
        assertEquals("aabaabab", ThreeLetters.solution2(5,3));
    }
    public void test12() {
        assertEquals("ababab", ThreeLetters.solution2(3,3));
    }
    public void test13() {
        assertEquals("bbabb", ThreeLetters.solution2(1,4));
    }
    public void test14() {
        assertEquals("ababababab", ThreeLetters.solution2(5,5));
    }
    public void test15() {
        assertEquals("ab", ThreeLetters.solution2(1,1));
    }
    public void test16() {
        assertEquals("aaba", ThreeLetters.solution2(3,1));
    }
}