/*
Reduce a string containing instances of the letters "A", "B" and "C" via the following rule:
remove one occurrence of "AA", "BB" or "CC".
 */
package org.example;

public class DisappearingPairs {
    public static String solution(String S){
        String resultStr = S;
        while(true) {
            S=resultStr;
            resultStr = resultStr.replace("AA", "");
            resultStr = resultStr.replace("BB", "");
            resultStr = resultStr.replace("CC", "");
            if(resultStr.length() == S.length()) break;
        }
        return resultStr;
    }

    public static int calc(StringBuilder str, int i){
        if(i>=0 && i<str.length()-1){
            if(str.charAt(i) == str.charAt(i+1)){
                str.deleteCharAt(i);
                str.deleteCharAt(i);
                --i;
                return calc(str, i);
            }
        }
        return i;
    }
    public static String solution2(String S){
        StringBuilder resultStr = new StringBuilder(S);
        for (int i=0; i<resultStr.length()-1; i++){
            i = calc(resultStr,i);
        }
        return resultStr.toString();
    }
}
