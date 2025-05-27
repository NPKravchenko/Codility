package org.example;

import junit.framework.TestCase;

public class TreeHeightTest extends TestCase {

    public void test1() {
        Tree node = new Tree(5);
        node.l = new Tree(3);
        node.r = new Tree(10);

        node.l.l = new Tree(20);
        node.l.r = new Tree(21);

        node.r.l = new Tree(1);

        assertEquals(2, TreeHeight.solution(node));
    }

    public void test2(){
        Tree node = new Tree(1);
        node.l =  new Tree(7);
        node.r = new Tree(9);

        node.l.l  = new Tree(2);
        node.l.r = new Tree(6);

        node.l.r.l = new Tree(5);
        node.l.r.r = new Tree(11);

        node.r.r = new Tree(9);
        node.r.r.l = new Tree(5);

        assertEquals(3, TreeHeight.solution(node));
    }
}