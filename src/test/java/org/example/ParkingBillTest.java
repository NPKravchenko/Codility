package org.example;

import junit.framework.TestCase;

public class ParkingBillTest extends TestCase {

    public void test1() {
        assertEquals(17, ParkingBill.solution( "10:00", "13:21"));
    }
    public void test2() {
        assertEquals(9, ParkingBill.solution( "09:42", "11:42"));
    }
    public void test3() {
        assertEquals(5, ParkingBill.solution( "00:10", "00:20"));
    }

    public void test4() {
        assertEquals(5, ParkingBill.solution( "00:00", "00:01"));
    }

    public void test5() {
        assertEquals(5, ParkingBill.solution( "00:00", "00:01"));
    }
    public void test6() {
        assertEquals(97, ParkingBill.solution( "00:00", "23:59"));
    }
}