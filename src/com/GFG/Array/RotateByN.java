package com.GFG.Array;

import com.array.reverseArr.ReverseArray;

import java.util.Arrays;

public class RotateByN {


    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6};

//        leftRotateByN1(arr,2);

        leftRotateByN2(arr,4);
    }

    public static void leftRotateByN2(int[] arr, int n) {
        ReverseArray.reverseArray(arr,0,n-1);
        System.out.println(Arrays.toString(arr));
        ReverseArray.reverseArray(arr,n,arr.length-1);
        System.out.println(Arrays.toString(arr));
        ReverseArray.reverseArray(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));

    }

    public static void leftRotateByN1(int[] arr, int n)
    {
        int[] temp= new int[n];

        for (int i = 0; i<n;i++)
        {
            temp[i]=arr[i];
        }

        for (int i=n    ;i<arr.length;i++)
        {
            arr[i-n]=temp[i];
        }
        for (int i=0;i<n;i++)
            arr[arr.length-n+i]=temp[i];

        Arrays.toString(arr);
    }









}
