/*
Find the smallest positive integer that does not occur in a given sequence.
 */
package org.lesson.CountingElements;

import java.util.Collections;
import java.util.Vector;

public class MissingInteger {
    public static int solution(int[] A){
       Vector<Integer> v = new Vector<>();
       v.add(0);

       for(int i = 0; i<A.length;i++){
           if(A[i]<1)
               continue;
           else
               v.add(A[i]);
       }

       if(v.isEmpty())
           return 1;

       Collections.sort(v);

       for(int i=0; i<v.size()-1; i++){
            if(v.get(i+1)-v.get(i)>1)
                return v.get(i)+1;
        }
        return v.lastElement()+1;
    }
}
