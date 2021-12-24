package com.GFG.MathematicalOps.prime;

public class Prime {


    public static void main(String[] args) {

        System.out.println(isPrime(2));
        System.out.println(isPrime(14));

        System.out.println(isPrime(7));
        System.out.println(isPrime(8));

        System.out.println("25" + isPrimeFullyOpti(25));
    }

    //naive
    public static boolean isPrime(int n)
    {
        if(n==1) return false;

        for(int i=2; i<n;i++)
        {
            if(n%i ==0)
                return false;
        }
        return true;
    }

    //optimized
    public static boolean isPrimeOpti(int n)
    {
        if(n==1) return false;

        for(int i=2; i*i<n;i++)
        {
            if(n%i ==0)
                return false;
        }
        return true;
    }

    //optimized for large n
    public static boolean isPrimeFullyOpti(int n)
    {
        if(n==1) return false;
        if(n==2 || n==3)  return true;

        if(n%2==0 || n%3==0) return false;

        for(int i=5; i*i<n;i+=6)
        {
            if(n%i ==0 || n%(i+2) == 0)
                return false;
        }
        return true;
    }
}
