package org.lesson.CountingElements;

import java.util.HashSet;

public class FrogRiverOne {
    public static int solution(int X, int[] A){
        HashSet<Integer> hs = new HashSet<>();
        for(int i = 0; i<A.length; i++){
            if(A[i]<=X){
                hs.add(A[i]);
                if(hs.size()==X)
                    return i;
            }
        }
        return -1;
    }
}
