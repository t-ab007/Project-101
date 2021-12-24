package com.array.kMinMax;

import java.util.Arrays;

public class KMinMaxElement {



    //get kth highest element
    static int getKMaxElement(int[] arr,int size, int k)
    {
        Arrays.sort(arr);

        return arr[size-(k-1)];
    }



    public static void main(String[] args) {
        int arr[] = {1000, 11, 445, 1, 330, 3000};
        int arr_size = 5;
        System.out.println(getKMaxElement(arr, arr_size, 3));
    }
}