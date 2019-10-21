package com.ucx.training.sessions;

public class TotalSum {
    static int sumUpTo(int n) {
        int result = 0;

        if (n == 0){
            throw new IllegalArgumentException("n cannot be 0!");
        }

        for (int x = 1; x <= n; x++)
            result += x;

        return result;
    }

    public static void main(String[] args) {
        int n = 15;
        System.out.println("Total summary from 1 to " + n + " is " + sumUpTo(n));
    }
}
