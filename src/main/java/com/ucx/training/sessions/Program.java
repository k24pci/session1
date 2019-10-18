package com.ucx.training.sessions;

public class Program
{
    public static void main(String... args)
    {
        int a [][] = {
                {1,2,3},
                {4,7,3,11}
        };

        System.out.println(a.length);

        int b = 2;

        System.out.println(b++);

        int[] numbers = {1,2,3,4,5,6,7};

        for (int i = 0; i < numbers.length; i++)
        {
            if (numbers[i] == 2) continue;
//            if (i != 1)
                System.out.println("Count is " + numbers[i]);
        }

        for (int i : numbers)
        {
            if (i == 2) continue;
                System.out.println("Enhanced Count is: " + i);
        }
    }
}
