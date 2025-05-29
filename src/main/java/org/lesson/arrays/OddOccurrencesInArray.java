package org.lesson.arrays;

import java.util.Arrays;

public class OddOccurrencesInArray {
    public static int solution(int[] A){
        Arrays.sort(A);
        for(int i = 0; i<A.length-1; i+=2) {
            if (A[i] != A[i + 1])
                return A[i];
        }
        return A[A.length-1];
    }
}
