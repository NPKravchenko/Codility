package org.example;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class ZigZag {
    //Definition for a binary tree node.

    class Solution {
        public static int calc(TreeNode T, boolean isLeft){
            if(T == null)
                return 0;

            int rc = 0;
            int lc = 0;
            if (T.left != null && !isLeft) {
                lc ++;
            }

            if (T.right != null && isLeft) {
                rc ++;
            }

            return Math.max(calc(T.left, true)+lc, calc(T.right, false)+rc);
        }

        public static int longestZigZag(TreeNode root) {
            if (root == null)
                return 0;
            int res = Math.max(calc(root.left, true), calc(root.right, false));
            if(res>0)
                return res+1;
            return res;
        }
    }
}
