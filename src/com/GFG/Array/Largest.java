package com.GFG.Array;

public class Largest {


    public static void main(String[] args) {

        int[] arr = {1,23,3,2,4,332,555};

        int res = arr[0];

        for(int i : arr)
        {
            if(res < i)
            {
               res = i;
            }
        }

        System.out.println("Largest Element : "+res);
    }
}
