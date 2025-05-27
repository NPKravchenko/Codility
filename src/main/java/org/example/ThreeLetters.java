/*
Write a function solution that, given two integers A and B, returns a string containing exactly A letters 'a' and exactly B letters 'b' with no three consecutive letters being the same
(in other words, neither "aaa" nor "bbb" may occur in the returned string).
 */

package org.example;

public class ThreeLetters {
    public static String solution(int A, int B){
        String s = "";

        char a = 'a';
        char b = 'b';
        if (B>A) {
            a='b';
            b='a';
            int t = A;
            A=B;
            B=t;
        }

        while(A>0 || B>0)
        {
            if (A == B) {
                s += a;
                s += b;
                A--;
                B--;
                continue;
            }
            if (B>0) {
                s += a;
                s += a;
                s += b;
                A-=2;
                B--;
                continue;
            }
            s += a;
            A--;
            continue;
        }
        return s;
    }

    public static String solution2(int A, int B){
        String s = "";
        while(A>0 || B>0)
        {
            if (B==0) {
                s += "a";
                --A;
                continue;
            }
            if (A==0) {
                s += "b";
                --B;
                continue;
            }
            if(A>B){
                s += "aab";
                A -= 2;
                B -= 1 ;
                continue;
            }
            if(A<B){
                s += "bba";
                B-=2;
                A--;
                continue;
            }
            if(A == B){
                s += "ab";
                A--;
                B--;
                continue;
            }
        }
        return s;
    }
}
