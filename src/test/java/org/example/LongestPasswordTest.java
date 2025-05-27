package org.example;

import junit.framework.TestCase;
import org.junit.Test;

public class LongestPasswordTest extends TestCase {

    @Test
    public void test1() {
        assertEquals(7, LongestPassword.solution("test 5 a0A pass007 ?xy1") );
    }
}