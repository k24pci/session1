package com.ucx.training.sessions;

public class PassMethodArgument
{
    public static void main(String[] args)
    {
        int x = 3;
        method(x);
        System.out.println(x);

        int array[] = {1, 3, 5};
        method2(array);
        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }

    public static void method(int p){
        p = 10;
    }

    public static void method2(int y[]){
        for (int i = 0; i < y.length; i++){
            y[i] = y[i] * 2;
        }
    }
}
