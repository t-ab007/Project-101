package com.array.rotate;

import java.util.Arrays;

public class RotateArray {

    static int arr[] = new int[]{1, 2, 3, 4, 5};

    static void rotateArray()
    {
        int temp = arr[arr.length-1];
        for (int i = arr.length-1; i > 0 ; i--)
        {
            arr[i] = arr[i-1];
        }
        arr[0] = temp;
    }

    static void rotateArraySwap()
    {
//        int i =0,temp;
//        while(i != arr.length-1)
//        {
//            temp = arr[i];
//            arr[i] = arr[arr.length-1];
//            arr[arr.length-1] = temp;
//            i++;
//        }
        int i =arr.length-1,temp;
        while(i > 0)
        {
            temp = arr[i];
            arr[i] = arr[0];
            arr[0] = temp;
            i--;
        }
    }

    public static void main(String[] args) {

        System.out.println("Original Array");
        System.out.println(Arrays.toString(arr));

        for(int i =0;i<3;i++)
            rotateArray();

        System.out.println("Rotated to right Array");
        System.out.println(Arrays.toString(arr));

        for(int i =0;i<3;i++)
        rotateArraySwap();

        System.out.println("Rotated to left Array");
        System.out.println(Arrays.toString(arr));

    }

}
