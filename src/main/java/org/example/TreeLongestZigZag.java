package org.example;
/*
n this problem we consider binary trees. Let's define a turn on a path as a change in
the direction of the path (i.e. a switch from right to left or vice versa).
A zigzag is simply a sequence of turns (it can start with either right or left).
 The length of a zigzag is equal to the number of turns.
 */

public class TreeLongestZigZag {
    public static int calc(Tree T, boolean isLeft){
        if(T == null)
            return 0;

        int rc = 0;
        int lc = 0;
        if (T.l != null && !isLeft) {
            lc ++;
        }

        if (T.r != null && isLeft) {
            rc ++;
        }

        return Math.max(calc(T.l, true)+lc, calc(T.r, false)+rc);
    }
    public static int solution(Tree T){
        if (T == null)
            return 0;

        return Math.max(calc(T.l, true), calc(T.r, false));
    }
}
