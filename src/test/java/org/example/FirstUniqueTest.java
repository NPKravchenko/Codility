package org.example;

import junit.framework.TestCase;
import org.junit.Test;

public class FirstUniqueTest extends TestCase {

    @Test
    public void test1() {
        assertEquals(2, FirstUnique.solution(new int [] {3,3,2,4,4}));
    }
    @Test
    public void test2() {
        assertEquals(-1, FirstUnique.solution(new int [] {}));
    }
    @Test
    public void test3() {
        assertEquals(1, FirstUnique.solution(new int [] {1,2,2,3,3}));
    }
    @Test
    public void test4() {
        assertEquals(5, FirstUnique.solution(new int [] {4, 10, 5, 4, 2, 10}));
    }
}