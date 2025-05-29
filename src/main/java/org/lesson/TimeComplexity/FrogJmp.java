package org.lesson.TimeComplexity;

public class FrogJmp {
    public static int solution(int X, int Y, int D){
        return (int) Math.ceil((float) (Y - X) / D);
    }

    public static int solution2(int X, int Y, int D){
        int steps = 0;
        while(X<=Y){
            X += D;
            steps++;
        }
        return steps;
    }
}
