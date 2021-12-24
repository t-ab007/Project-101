package com.array.moveNeg;

public class MoveNegative {

    public static void rearrange(int[] arr, int n)
    {
        int j =0 ;
        for (int i =0 ; i < n; i++)
        {
            if(arr[i]<0)
            {
                if(i != j)
                {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                j++;
            }
        }
    }

    public static void printArray(int[] arr, int n)
    {
        System.out.print(" { ");
        for (int a : arr) {
            System.out.print(" " + a);
        }
        System.out.println(" } ");
    }

    public static void main(String[] args) {
        int arr[] = { -1, 2, -3, 4, 5, 6, -7, 8, 9 };
        int n = arr.length;

        printArray(arr, n);
        rearrange(arr, n);
        printArray(arr, n);
    }

}
