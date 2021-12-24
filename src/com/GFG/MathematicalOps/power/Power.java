package com.GFG.MathematicalOps.power;

public class Power {

    public static void main(String[] args) {

        System.out.println(pow(2,4));
//        System.out.println(powOpti(3,4));
        System.out.println(powFullyOpti(3,4));
    }

    public static int pow(int x, int n)
    {
        int res = 1;
        for(int i=0;i<n;i++)
        {
            res *= x;
        }

        return res;
    }

    public static int powOpti(int x, int n)
    {
        if(n==0)
            return 1;

        int temp = powOpti(x,n/2);

        temp *= temp;

        if(n%2 == 0)
            return temp;
        else
            return temp*x;
    }

    public static int powFullyOpti(int x, int n)
    {
        int res = 1;
        while(n>0)
        {
            if(n%2 != 0)
                res *= x;

            x *= x;
            n /= 2;
        }
        return res;
    }

}
