package org.lesson.iterations;

public class BinaryGap {
    public static int solution(int N){
        int count = 0;
        int maxCount = 0;
        boolean firstOne = false;

        while(N!=0){
            if((N&1) == 0 && firstOne) {
                    count++;
            }
            if((N&1) == 1){
                firstOne = true;
                maxCount = Math.max(count, maxCount);
                count = 0;
            }
            N = N >> 1;
        }
        return maxCount;
    }
}
