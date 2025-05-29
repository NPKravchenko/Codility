/*
Check whether array A is a permutation.
 */
package org.lesson.CountingElements;

import java.util.Arrays;
import java.util.HashSet;

public class PermCheck {
    public static int solution(int[] A){
        HashSet<Integer> hs = new HashSet<>(A.length+1);
        int min = A[0];
        int max = A[0];

        Arrays.sort(A);

        if(A.length == 1 && A[0] == 1)
            return 1;

        for(int i = 0; i<A.length; i++){
            if(hs.contains(A[i]))
                return 0;
            if(A[i]<1)
                return 0;
            hs.add(A[i]);
            if(A[i] < min)
                min = A[i];
            if(A[i] > max)
                max = A[i];
        }

        if(hs.size() == max-min+1 && min ==1)
            return 1;
        else
            return 0;
    }
}
