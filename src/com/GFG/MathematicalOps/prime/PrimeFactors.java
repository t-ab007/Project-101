package com.GFG.MathematicalOps.prime;

public class PrimeFactors {


    public static void main(String[] args) {

        primeFactors(20);
    }

    public static void primeFactors(int n)
    {
        for(int i=2; i<n; i++)
        {
            if(Prime.isPrimeFullyOpti(i))
            {
                int x=i;
                while(n%x == 0)
                {
                    System.out.print(i+" ");
                    x *= i;
                }
            }
        }
        System.out.println();
    }



    //optimized
    public static void primeFactorsOpti(int n)
    {
        if(n<=1) return;

        for(int i=2; i*i<n; i++)
        {
            while(n%i == 0)
            {
                System.out.print(i+" ");
                n/=i;
            }
        }

        if(n > 1)
            System.out.print(n);

        System.out.println();
    }

    //super Optimized
    public static void primeFactorsFullyOpti(int n)
    {
        if(n<=1) return;

        while(n%2 == 0)
        {
            System.out.print("2 ");
            n /= 2;
        }

        while(n%3 == 0)
        {
            System.out.print("3 ");
            n /= 3;
        }

        for(int i=5; i*i<n; i+=6)
        {
            while(n%i == 0)
            {
                System.out.print(i+" ");
                n/=i;
            }

            while(n%(i+2) == 0)
            {
                System.out.print((i+2)+" ");
                n/=(i+2);
            }
        }

        if(n > 3)
            System.out.print(n);

        System.out.println();
    }
}
