package com.GFG.Array;

public class SecondLargest {


    public static void main(String[] args) {

        int[] arr = {100,200,43,230,232};

        int largest = arr[0], res = arr[0];

        for(int i : arr)
        {
            if(largest < i)
            {
                res = largest;
                largest = i;
            }
        }
        System.out.println("Largest Element : " + largest);
        System.out.println("Second Largest Element : " + res);
    }
}
