package com.GFG.MathematicalOps.prime;


import java.util.Arrays;

public class PrimeNumList {

    static boolean arr[];

    public static void main(String[] args) {

        printPrimes(15);

        sieve(27);
    }


    public static void printPrimes(int n)
    {
        for(int i =2;i<=n;i++)
        {
            if(Prime.isPrimeFullyOpti(i))
            {
                System.out.println(i);
            }
        }
    }

    public static void sieve(int n)
    {
        arr = new boolean[n+1];
        Arrays.fill(arr,true);
//        for(boolean a : arr ) System.out.print(a);
        for(int i =2; i*i <= n;i++)
        {
            if(arr[i])
            {
                for(int j = 2*i;j<=n;j+=i)
                {
                    arr[j] = false;
                }
            }
        }
        for(int i=2;i<=n;i++)
        {
            if(arr[i])
            {
                System.out.print(i+" ");
            }
        }
    }

}
