package org.lesson.TimeComplexity;

public class TapeEquilibrium {
    public static int solution(int[] A){
        int sumLeft = A[0];
        int sumRight = 0;
        int diff = 0;
        for(int i=1; i<A.length; i++)
            sumRight += A[i];
        int diffMin = Math.abs(sumLeft-sumRight);
        for(int i = 1; i<A.length-1; i++){
            sumLeft += A[i];
            sumRight -= A[i];
            diff = Math.abs(sumRight-sumLeft);
            diffMin = Math.min(diff, diffMin);
        }
        return diffMin;
    }
}
