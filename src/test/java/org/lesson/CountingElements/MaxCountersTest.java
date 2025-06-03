package org.lesson.CountingElements;

import junit.framework.TestCase;
import org.junit.Test;


import static org.junit.Assert.*;


public class MaxCountersTest extends TestCase {

    @Test
    public void testSolution() {
        int[] solution = MaxCounters.solution(5, new int[]{3, 4, 4, 6, 1, 4, 4});
        int[] expected = new int[]{3, 2, 2, 4, 2};
        assertArrayEquals(expected,solution);
    }
}