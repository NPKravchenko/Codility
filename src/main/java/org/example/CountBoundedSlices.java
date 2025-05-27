/*
An integer K and a non-empty array A consisting of N integers are given.

A pair of integers (P, Q), such that 0 ≤ P ≤ Q < N, is called a slice of array A.

A bounded slice is a slice in which the difference between the maximum and minimum values
in the slice is less than or equal to K. More precisely it is a slice,
such that max(A[P], A[P + 1], ..., A[Q]) − min(A[P], A[P + 1], ..., A[Q]) ≤ K.

The goal is to calculate the number of bounded slices.

For example, consider K = 2 and array A such that:

    A[0] = 3
    A[1] = 5
    A[2] = 7
    A[3] = 6
    A[4] = 3
There are exactly nine bounded slices: (0, 0), (0, 1), (1, 1), (1, 2), (1, 3), (2, 2), (2, 3), (3, 3), (4, 4).

Write a function:

class Solution { public int solution(int K, int[] A); }

that, given an integer K and a non-empty array A of N integers, returns the number of bounded slices of array A.

If the number of bounded slices is greater than 1,000,000,000, the function should return 1,000,000,000.

For example, given:

    A[0] = 3
    A[1] = 5
    A[2] = 7
    A[3] = 6
    A[4] = 3
the function should return 9, as explained above.

Write an efficient algorithm for the following assumptions:

N is an integer within the range [1..100,000];
K is an integer within the range [0..1,000,000,000];
each element of array A is an integer within the range [−1,000,000,000..1,000,000,000].
 */
package org.example;

import java.util.TreeMap;

class Slices{
   TreeMap<Integer,Integer> map =  new TreeMap<>();
    private int i1 = 0 , i2 = 0;
    int [] array;

    public Slices(int[]A) {
       this.array = A;
    }

    boolean pop(){
        if(i1<i2){
            i1++;
            int tmp = map.get(i1);
            if(tmp == 1)
                map.remove(i1);
            else
                map.put(i1, tmp-1);
            return true;
        }
        return false;
    }

    boolean push(){
        if(i2 < array.length-1) {
            i2++;
            map.put(i2, map.getOrDefault(array[i2], 0) + 1);
            return true;
        }
        return false;
    }
    int max(){
        return map.lastKey();
    }
    int min(){
        return map.firstKey();
    }
    int size(){
        return i2-i1;
    }
}

public class CountBoundedSlices {
    public static int solution(int K, int[] A){
        int q_slices = 0;

        Slices s = new Slices(A);
        while(true) {
            boolean b = s.push();
            if (b == false){
                if (s.max() - s.min() <= K) {
                    return q_slices;
                }
                while(s.pop()){
                    if (s.max() - s.min() <= K) {
                        return q_slices + s.size();
                    }
                }
                return q_slices+1;
            }

            if (s.max() - s.min() <= K)
                q_slices += s.size();
            else {
                boolean p = s.pop();
                if (p && s.max() - s.min() <= K)
                    q_slices += s.size();
            }
        }
    }
}
