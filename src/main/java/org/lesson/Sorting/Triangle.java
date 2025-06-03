package org.lesson.Sorting;

import java.util.Arrays;

public class Triangle {
    public static int solution(int[] A){

        for(int i = 0; i<A.length-2; i++){
            for(int j = i+1; j<A.length-1; j++){
                for(int k = j+1; k<A.length; k++){
                    if(A[i]+A[j] > A[k] && A[j]+A[k] > A[i] && A[k]+A[i] > A[j])
                        return 1;
                }
            }
        }
        return 0;
    }

    public static int solution2(int[] A){
        Arrays.sort(A);
        for(int i = 0; i<A.length-2; i++)
            if((long)A[i]+A[i+1] > A[i+2])
                return 1;
        return 0;
    }
}
