/*
Maximize A[P] * A[Q] * A[R] for any triplet (P, Q, R).
 */
package org.lesson.Sorting;

import java.util.Arrays;
import java.util.TreeMap;

public class MaxProductOfThree {
    public static int multiMax(TreeMap<Integer,Integer> map, int currValue){
        int curmax = 0;
        if (map.lastEntry().getValue() > 1)
            curmax = map.lastKey() * map.lastKey() * currValue;
        else {
            int lk = map.lastKey();
            map.remove(lk);
            curmax = lk * map.lastKey() * currValue;
            map.put(lk, 1);
        }
        return curmax;
    }

    public static int multiMin(TreeMap<Integer,Integer> map, int currValue){
        int curmax = 0;
        if (map.firstEntry().getValue() > 1)
            curmax = map.firstKey() * map.firstKey() * currValue;
        else {
            int fk = map.firstKey();
            map.remove(fk);
            curmax = fk * map.firstKey() * currValue;
            map.put(fk, 1);
        }
        return curmax;
    }

    public static int multiMinMax(TreeMap<Integer,Integer> map, int currValue){
        return map.firstKey()*map.lastKey()*currValue;
    }

    public static int solution(int[] A){
        int max = A[0]*A[1]*A[2];
        TreeMap<Integer, Integer> tm = new TreeMap<>();

        for(int i = 1; i<A.length; i++)
            tm.put(A[i], tm.getOrDefault(A[i], 0)+1);

        int curmax = 0;

        for(int i = 0; i<A.length-2; i++) {
            if (A[i]>=0) {
                curmax = multiMax(tm, A[i]);
                max = Math.max(curmax, max);
                curmax = multiMin(tm, A[i]);
                max = Math.max(curmax, max);
            } else {
                curmax = multiMinMax(tm, A[i]);
                max = Math.max(curmax, max);
            }

            if(tm.get(A[i +1])>1)
                tm.put(A[i+1], tm.get(A[i+1])-1);
            else
                tm.remove(A[i+1]);
        }
        return max;
    }
    public static int solution2(int[] A){
        int max[] = {-1000, -1000, -1000};
        int min[] = {1000, 1000};

        for(int i = 0; i<A.length; i++){
            if(A[i] >= max[0]){
                max[2] = max[1];
                max[1] = max[0];
                max[0] = A[i];
            } else if(A[i] >= max[1]){
                max[2] = max[1];
                max[1] = A[i];
            } else if(A[i] >= max[2]){
                max[2] = A[i];
            }
            if(A[i] <= min[0]){
                min[1] = min[0];
                min[0] = A[i];
            }else if(A[i] <= min[1]){
                min[1] = A[i];
            }
      }
        return Math.max((max[0]*max[1]*max[2]), (max[0]*min[0]*min[1]));
    }
}
