package com.GFG.Array;

public class RemoveDups {


    public static void main(String[] args) {
        int[] arr = {10,20,20,30,30,30};

        int res = 1;

        System.out.println("BEFORE "+arr[2]);

        for(int i = 1;i < arr.length;i++)
        {
            if(arr[i]!=arr[res-1])
            {
                arr[res] = arr[i];
                res++;
            }
        }

        System.out.println("AFTER "+arr[2]);
    }
}
