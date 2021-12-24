package com.GFG.BitOperations;

public class FindOddOccuringNumber {


    public static void main(String[] args) {

        int[] arr = new int[]{4,3,4,4,4,5,5};

        System.out.println(findOdd(arr,arr.length));

    }

    static int findOdd(int arr[], int n)
    {
        int res=0;
        for(int i=0;i<n;i++)
        {
            res=res^arr[i];
        }
        return res;
    }
}
