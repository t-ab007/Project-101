package com.GFG.BitOperations;

public class PowOf2 {
    public static void main(String[] args) {


        System.out.println(checkPowOf2(2));
        System.out.println(checkPowOf2(4));
        System.out.println(checkPowOf2(6));
        System.out.println(checkPowOf2(16));
    }

    static boolean checkPowOf2(int n)
    {
        return (n!=0)&&((n&(n-1))==0);
    }
}
