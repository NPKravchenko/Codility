package org.example;

import junit.framework.TestCase;

public class DisappearingPairsTest extends TestCase {

    public void test1() {
        assertEquals("AC", DisappearingPairs.solution("ACCAABBC"));
    }
    public void test2() {
        assertEquals("", DisappearingPairs.solution("ABCBBCBA"));
    }
    public void test3() {
        assertEquals("BABABA", DisappearingPairs.solution("BABABA"));
    }

    public void test4() {
        assertEquals("AC", DisappearingPairs.solution2("ACCAABBC"));
    }
    public void test5() {
        assertEquals("", DisappearingPairs.solution2("ABCBBCBA"));
    }
    public void test6() {
        assertEquals("BABABA", DisappearingPairs.solution2("BABABA"));
    }
    public void test7() {
        assertEquals("", DisappearingPairs.solution2("ACAACCAACA"));
    }
}