/*
Bob is about to go on a trip. But first he needs to take care of his supply of socks.
Each sock has its own color. Bob wants to take as many pairs of clean socks as possible (both socks in the
pair should be of the same color).

Socks are divided into two drawers: clean and dirty socks.
Bob has time for only one laundry and his washing machine can clean at most K socks.
He wants to pick socks for laundering in such a way that after washing he will have a maximal number of clean, same-colored pairs of socks. It is possible that some socks cannot be paired with any other sock, because Bob may have lost some socks over the years.

Bob has exactly N clean and M dirty socks, which are described in arrays C and D, respectively.
The colors of the socks are represented as integers (equal numbers representing identical colors).

For example, given four clean socks and five dirty socks:



If Bob's washing machine can clean at most K = 2 socks, then he can take a maximum of three pairs
of clean socks. He can wash one red sock and one green sock, numbered 1 and 2 respectively.
Then he will have two pairs of red socks and one pair of green socks.

Write a function:

class Solution { public int solution(int K, int[] C, int[] D); }

that, given an integer K (the number of socks that the washing machine can clean),
two arrays C and D (containing the color representations of N clean and M dirty socks respectively),
returns the maximum number of pairs of socks that Bob can take on the trip.

For example, given K = 2, C = [1, 2, 1, 1] and D = [1, 4, 3, 2, 4], the function should return 3,
as explained above.

Assume that:

K is an integer within the range [0..50];
each element of arrays C and D is an integer within the range [1..50];
C and D are not empty and each of them contains at most 50 elements.
 */
package org.example;

import java.util.*;

public class SocksLaundering {
    public static int solution(int K, int[] C, int[] D){
        int pairs = 0;
        HashMap<Integer,Integer> clean = new HashMap<>();
        for(int i:C)
            clean.put(i, clean.getOrDefault(i,0)+1);

        HashMap<Integer,Integer> dirty = new HashMap<>();
        for(int i:D)
            dirty.put(i, dirty.getOrDefault(i,0)+1);

        List<Integer> l = new ArrayList<>();
        for(Map.Entry<Integer,Integer> entry: clean.entrySet()) {
            int cc = entry.getValue() / 2;
            pairs += cc;
            if((entry.getValue() & 1) == 1 ){
                l.add(entry.getKey());
            }
        }
        if(K == 0)
            return pairs;

        int wash_count = 0;
        for(int i:l){
            if(dirty.containsKey(i))
            {
                wash_count++;
                pairs++;
                dirty.put(i,dirty.get(i)-1);
            }
        }

        for(Map.Entry<Integer,Integer> entry: dirty.entrySet()){
            int dirty_pairs =  entry.getValue() / 2;
            int can_wash = (K-wash_count)/2;
            int washed_pairs = Math.min(can_wash, dirty_pairs);
            pairs += washed_pairs;
            wash_count += washed_pairs*2;
            if(K-wash_count<2)
                return pairs;
        }
        return pairs;
    }
}
