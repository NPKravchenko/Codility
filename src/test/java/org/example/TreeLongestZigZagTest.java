package org.example;

import junit.framework.TestCase;

public class TreeLongestZigZagTest extends TestCase {
    public void test1() {
        // (5, (3, (20, (6, None, None), None), None),
        // (10, (1, None, None), (15, (30, None, (9, None, None)), (8, None, None))))
        Tree node = new Tree(5);
        node.l = new Tree(3);
        node.r = new Tree(10);

        node.l.r = new Tree(20);
        node.l.r.r = new Tree(6);

        node.r.l = new Tree(1);
        node.r.r = new Tree(15);

        node.r.l.l = new Tree(30);
        node.r.l.r = new Tree(8);

        node.r.l.l.r = new Tree(9);

        assertEquals(2, TreeLongestZigZag.solution(node));
    }

    public void test2() {
        Tree node = new Tree(5);
        node.l = new Tree(3);
        node.r = new Tree(10);

        node.l.l = new Tree(20);
        node.l.r = new Tree(21);

        node.r.l = new Tree(1);

        assertEquals(1, TreeLongestZigZag.solution(node));
    }

    public void test3(){
        Tree node = new Tree(1);
        node.l =  new Tree(7);
        node.r = new Tree(9);

        node.l.l  = new Tree(2);
        node.l.r = new Tree(6);

        node.l.r.l = new Tree(5);
        node.l.r.r = new Tree(11);

        node.r.r = new Tree(9);
        node.r.r.l = new Tree(5);

        assertEquals(2, TreeLongestZigZag.solution(node));
    }

    public void test4(){
        Tree node = new Tree(1);
        node.l =  new Tree(7);
        node.r = new Tree(9);

        assertEquals(0, TreeLongestZigZag.solution(node));
    }

    public void test5(){
        Tree node = new Tree(1);

        assertEquals(0, TreeLongestZigZag.solution(node));
    }
}