package org.lesson.arrays;

import junit.framework.TestCase;

import java.util.Arrays;

public class CyclicRotationTest extends TestCase {

    public void test1() {
        assertTrue (Arrays.equals(new int[]{3,4,1,2}, CyclicRotation.solution(new int[]{1, 2, 3, 4}, 2)));
    }
    public void test2() {
        assertTrue (Arrays.equals(new int[]{9, 7, 6, 3, 8}, CyclicRotation.solution(new int[]{3, 8, 9, 7, 6}, 3)));
    }
    public void test3() {
        assertTrue (Arrays.equals(new int[]{1, 2, 3, 4}, CyclicRotation.solution(new int[]{1, 2, 3, 4}, 4)));
    }
    public void test4() {
        assertTrue (Arrays.equals(new int[]{0, 0, 0}, CyclicRotation.solution(new int[]{0, 0, 0}, 1)));
    }
    public void test5() {
        assertTrue (Arrays.equals(new int[]{1,1}, CyclicRotation.solution(new int[]{1,1}, 0)));
    }
    public void test6() {
        assertTrue (Arrays.equals(new int[]{0}, CyclicRotation.solution(new int[]{0}, 1)));
    }
    public void test7() {
        assertTrue (Arrays.equals(new int[]{-1,8,7,100,5,4}, CyclicRotation.solution(new int[]{5,4,-1,8,7,100}, 100)));
    }
}