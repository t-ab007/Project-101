package com.GFG.MathematicalOps.factorial;

public class Factorial {


    public static void main(String[] args) {

        System.out.println(getFactorialByRecusrion(0));
        System.out.println(getFactorialByRecusrion(1));
        System.out.println(getFactorialByRecusrion(10));
        System.out.println(getFactorialByRecusrion(2));
        System.out.println(getFactorialByRecusrion(4));

        System.out.println(getFactorialByIteraion(0));
        System.out.println(getFactorialByIteraion(1));
        System.out.println(getFactorialByIteraion(10));
        System.out.println(getFactorialByIteraion(2));
        System.out.println(getFactorialByIteraion(4));

    }


    static int getFactorialByRecusrion(int n)
    {
        if(n == 0 || n == 1)
        {
            return 1;
        }
        else
        {
            return (n*getFactorialByRecusrion(n-1));
        }
    }

    static int getFactorialByIteraion(int n)
    {
        int temp = 1;
        for(int i = 2; i<=n; i++)
            temp *= i;

        return temp;
    }

    static double getFactorialByIteraionL(double n)
    {
        double temp = 1;
        for(int i = 2; i<=n; i++)
            temp *= i;

        return temp;
    }
}