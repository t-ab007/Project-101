package com.GFG.MathematicalOps.divisors;

public class Divisors {

    public static void main(String[] args) {

        printDiv(20);

        printDivOpti(20);

        printDivOptiSorted(20);
    }

    public static void printDiv(int n){
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
                System.out.print(i+" ");

        }
        System.out.println();
    }

    //optimized
    public static void printDivOpti(int n){
        for(int i=1;i*i<=n;i++)
        {
            if(n%i==0) {
                System.out.print(i + " ");
                if(i!=(n/i))
                    System.out.print((n/i)+" ");

            }
        }
        System.out.println();
    }

    //fully optimized for sorted o/p
    public static void printDivOptiSorted(int n){
        int i;

        for(i=1;i*i<=n;i++)
        {
            if(n%i==0) {
                System.out.print(i + " ");
            }
        }
        for(i--;i>=1;i--)
        {
            if(n%i==0)
                System.out.print((n/i)+" ");
        }
    }
}
