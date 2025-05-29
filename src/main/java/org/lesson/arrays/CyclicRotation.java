/*
An array A consisting of N integers is given. Rotation of the array means that each element is shifted right by one index, and the last element of the array is moved to the first place. For example, the rotation of array A = [3, 8, 9, 7, 6] is [6, 3, 8, 9, 7] (elements are shifted right by one index and 6 is moved to the first place).

The goal is to rotate array A K times; that is, each element of A will be shifted to the right K times.
 */
package org.lesson.arrays;

public class CyclicRotation {
    public static int[] solution(int[] A, int K){
        final int N = A.length;
        int [] AA = new int[N];

        if(A.length == 0)
            return A;
        if(K > N)
            K = K%N;
        if(K == 0)
            return A;
        AA[0] = A[N - K];
        for(int i = 1; i < N; i++) {
            int indA = N - K + i;
            if(indA >= N)
                indA -= N;
            AA[i] = A[indA];
        }
        return AA;
    }
}
