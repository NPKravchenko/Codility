package org.example;

class Test1
{
    public  void calc (){
        for (int i = 0; i <=100; i++)
        {
            System.out.println(i);
            if (i % 3 == 0 )
                System.out.println("Fizz");
            if (i % 5 == 0 )
                System.out.println("Buzz");
            if (i % 15 == 0)
                System.out.println("FizzBuzz");
            else
                System.out.println(i);
        }
    }
}
public class FizzBizz {
    public static void main(String[] args) {

        Test1 t = new Test1();
        t.calc();

    }
}
