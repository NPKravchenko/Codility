package org.example;

import junit.framework.TestCase;
import org.junit.Test;

public class RectangleBuilderGreaterAreaTest extends TestCase {

    @Test
    public void test1() {
        assertEquals(2, RectangleBuilderGreaterArea.solution(new int [] {1,2,5,1,1,2,3,5,1}, 5 ));
    }
    @Test
    public void test2() {
        assertEquals(2, RectangleBuilderGreaterArea.solution(new int [] {1,1,2,2,3,3,4,4}, 7 ));
    }

    @Test
    public void test3() {
        assertEquals(5, RectangleBuilderGreaterArea.solution(new int [] {1,1,2,2,3,3,4,4,5,5}, 7 ));
    }

    @Test
    public void test4() {
        assertEquals(1, RectangleBuilderGreaterArea.solution(new int [] {2,2,2,2}, 4 ));
    }

    @Test
    public void test5() {
        assertEquals(0, RectangleBuilderGreaterArea.solution(new int [] {2,2}, 4 ));
    }

    @Test
    public void test6() {
        assertEquals(0, RectangleBuilderGreaterArea.solution(new int [] {2,2,1,3}, 4 ));
    }
    @Test
    public void test7() {
        assertEquals(1, RectangleBuilderGreaterArea.solution(new int [] {2,2,2,3,3,3}, 4 ));
    }
    @Test
    public void test8() {
        assertEquals(3, RectangleBuilderGreaterArea.solution(new int [] {2,2,2,2,4,4,4,4}, 4 ));
    }
}