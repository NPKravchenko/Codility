/*
Count the number of passing cars on the road.
 */
package org.lesson.PrefixSums;

public class PassingCars {
    public static int solution(int[] A){
        int pairs = 0;
        if(pairs >1000000000)
            return -1;

        for(int i=0; i<A.length; i++){
            if (A[i] == 0){
                for(int j = i+1; j<A.length; j++){
                    if(A[j] == 1)
                        pairs++;
                }
            }
        }
        return pairs;
    }
    public static int solution2(int[] A){
        int pairs = 0;
        int one = 0;

        for(int i=A.length-1; i>=0; i--){
            if(A[i] == 1)
                one++;
            else
                pairs += one;
            if(pairs >1000000000)
                return -1;
        }
        return pairs;
    }
}
