package org.example;

import junit.framework.TestCase;

public class ZigZagTest extends TestCase {
    public void test1() {
        TreeNode node = new TreeNode(5);
        node.left = new TreeNode(3);
        node.right = new TreeNode(10);

        node.left.left = new TreeNode(20);
        node.left.right = new TreeNode(21);

        node.right.left = new TreeNode(1);

        assertEquals(2, ZigZag.Solution.longestZigZag(node));
    }

}