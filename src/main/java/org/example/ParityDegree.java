/*
A positive integer N is given. The goal is to find the highest power of 2 that divides N. In other words,
we have to find the maximum K for which N modulo 2^K is 0.
For example, given integer N = 24 the answer is 3, because 2^3 = 8 is the highest power of 2 that divides N.

Write a function:
class Solution { public int solution(int N); }

that, given a positive integer N, returns the highest power of 2 that divides N.
For example, given integer N = 24, the function should return 3, as explained above.
Assume that:
N is an integer within the range [1..1,000,000,000].
 */
package org.example;

public class ParityDegree {

    public static int solution(int N){
        if ((N & 1) != 0)
            return 0;
        return solution(N>>1) + 1;
    }

    public static int solution2(int N){
        int power =0;
        while((N & 1) != 0){
            N = N/2;
            power ++;
        }
        return power;
    }
}
