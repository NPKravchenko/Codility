/*
Write a function:
class Solution { public int solution(String S); }
that, given a string S, returns the index (counting from 0) of a character such that the part of
the string to the left of that character is a reversal of the part of the string to its right.
The function should return −1 if no such index exists.
Note: reversing an empty string (i.e. a string whose length is zero) gives an empty string.
For example, given a string:
"racecar"
the function should return 3, because the substring to the left of the character "e" at index 3 is "rac",
and the one to the right is "car".
Given a string:
"x"
the function should return 0, because both substrings are empty.
Write an efficient algorithm for the following assumptions:
the length of string S is within the range [0..2,000,000].
 */
package org.example;

public class StrSymmetryPoint {
    public static int solution(String S){
        int middle = S.length()/2;
        int i = 0;
        int j = 0;

        if ((S.length() & 1) == 0)
            return -1;
        for (i = middle, j = middle; j>=0; j--, i++ )
                if (S.charAt(i) != S.charAt(j))
                    return -1;
        return middle;
    }
}