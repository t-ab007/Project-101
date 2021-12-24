package com.GFG.BitOperations;

public class CountSetBits {


    public static void main(String[] args) {


        System.out.println(countSet(7));
        System.out.println(countSet(5));
    }

    static int countSet(int n)
    {
        int cunt = 0;
        while(n>0) {
            n = (n & (n - 1));
            cunt++;
        }

        return cunt;
    }

}
