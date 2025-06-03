/*
Compute number of distinct values in an array.
 */
package org.lesson.Sorting;
import java.util.*;

public class Distinct {
    public static int solution(int[] A){
        HashSet<Integer> hs = new HashSet<>();
        for(int i=0; i<A.length; i++){
            hs.add(A[i]);
        }
        return hs.size();
    }
}
