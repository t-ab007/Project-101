package com.GFG.Array;

import java.util.Arrays;

public class ArraySorted {


    public static void main(String[] args) {

        int[] arr = {12,23,43,45,340};
        boolean flag = true;
        for(int i=1; i<arr.length;i++)
        {
            if(arr[i-1]>arr[i])
            {
                flag = false;
                break;
            }
        }
        if(flag)
            System.out.println("YES !!!");
        else
            System.out.println("NO !!!");

        int[] test = new int[3];
        Arrays.stream(test).forEach(System.out::println);

    }
}
