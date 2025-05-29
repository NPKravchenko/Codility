/*
Compute number of integers divisible by k in range [a..b].
 */
package org.lesson.PrefixSums;

public class CountDiv {
    public static int solution(int A, int B, int K){
        int count;
        int l = 0;
        int r = 0;

        if(A>0)
            l = (A-1)/K;
        r = B/K;

        count = r-l;

        if(A==0)
            count++;

        /*for (int i=A; i<=B; i++){
            if(i%K == 0)
                count++;
        }*/
        return count;
    }
}
