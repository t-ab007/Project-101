package com.GFG.Array;

public class MoceZero {


    public static void main(String[] args) {

        int[] arr = {1,2,3,0,4,50,0,65};

        int zIndex = 0,temp;

        for(int i = 0; i<arr.length; i++)
        {
            if(arr[i]!=0)
            {
//                swap(arr[i],arr[zIndex]);
                temp = arr[i];
                arr[i] = arr[zIndex];
                arr[zIndex] = temp;

                zIndex++;
            }
        }

        for (int i : arr)
        {
            System.out.print(i + " ");
        }
    }
}
