package com.packages.recursitivy;

public class Recursion 
{
    public static long factorialRecursive(int n)
    {
        if (n == 0) {
            return 1;
        } else {
            return n * factorialRecursive(n - 1);
        }
    }

    public static long sumNaturalsRecursive(int n)
    {
        System.out.println(n);
        if (n == 1) {
            return 1;
        } else {
            return n + sumNaturalsRecursive(n - 1);
        }
    }

    public static int fibonacciRecursive(int n)
    {
        System.out.println(n);
        if (n < 2) {
            return n;
        } else {
            return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
        }
    }
}
