package org.lesson.TimeComplexity;

import java.util.Arrays;

public class PermMissingElem {
    public static int solution(int[] A){
        int count=1;
        Arrays.sort(A);
        for(int i = 0; i<A.length; i++){
            if(A[i]!=count)
                return count;
            count++;
        }
        return count;
    }
}
