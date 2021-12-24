package com.GFG.BitOperations;

public class FindNthBit {


    public static void main(String[] args) {

        System.out.println(checkNthBit(5,2));
        System.out.println(checkNthBit(7,2));
    }

    public static boolean checkNthBit(int num, int n)
    {
        if(((num >> (n-1))&1) == 1 )
            return true;
        else
            return false;
    }
}
