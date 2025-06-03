/*
Calculate the values of counters after applying all alternating operations: increase counter by 1; set value of all counters to current maximum.
 */
package org.lesson.CountingElements;

public class MaxCounters {
    public static int[] solution(int N, int[] A){
        int[] counts = new  int[N];
        int max = 0;
        int max2 = 0;
        for(int k=0; k<A.length; k++){
            if(A[k] <= N){
                counts[A[k]-1]++;
                max = Math.max(max, counts[A[k]-1]);
            }
            else {
                for(int i=0; i<N; i++){
                 counts[i] = max;
                }
                max = 0;
            }

        }
     return counts;
    }

    public static int[] solution2(int N, int[] A){
        int[] counts = new  int[N];
        int max = 0;
        int max2 = 0;
        for(int k=0; k<A.length; k++){
            if(A[k] <= N){
                counts[A[k]-1]++;
                max = Math.max(max, counts[A[k]-1]);
            }
            else {
                counts = new int[N];
                //for(int i=0; i<N; i++){
                //   counts[i] = max;
                //}
                max2 += max;
                max = 0;
            }

        }
        for(int i=0; i<N; i++){
            counts[i] += max2;
        }
        return counts;
    }
}
