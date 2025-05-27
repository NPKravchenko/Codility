package org.example;

import junit.framework.TestCase;
import org.junit.Test;

public class SocksLaunderingTest extends TestCase {

    @Test
    public void test1() {
        assertEquals(3, SocksLaundering.solution(2,new int [] {1, 2, 1, 1}, new int [] {1, 4, 3, 2, 4}));
    }
    @Test
    public void test2() {
        assertEquals(3, SocksLaundering.solution(2,new int [] {1, 1, 1, 1}, new int [] {1, 4, 3, 2, 4}));
    }
    @Test
    public void test3() {
        assertEquals(3, SocksLaundering.solution(4,new int [] {1, 1}, new int [] {2, 3, 3, 2, 4}));
    }
}