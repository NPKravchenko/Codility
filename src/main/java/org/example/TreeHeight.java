package org.example;

import java.util.ArrayList;

class Tree {
    public int x;
    public Tree l;
    public Tree r;

    public Tree(int x) {
        this.x = x;
    }

    public Tree(int x, Tree l, Tree r) {
        this.x = x;
        this.l = l;
        this.r = r;
    }
}
public class TreeHeight {

    public static int calc(Tree T){
        if(T == null)
            return 0;
        return Math.max(calc(T.l), calc(T.r)) + 1;
    }

    public static int solution(Tree T){
        if(T == null)
            return 0;
        return Math.max(calc(T.l), calc(T.r));
    }
}

