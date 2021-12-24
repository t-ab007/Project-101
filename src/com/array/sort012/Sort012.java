package com.array.sort012;

public class Sort012 {




    static void sortArr(int[] arr, int len)
    {
        int count0=0, count1=0, count2=0;
        for(int i =0; i < len;i++)
        {
            switch (arr[i])
            {
                case 0: count0++;
                        break;
                case 1: count1++;
                        break;
                case 2: count2++;
                        break;
            }
        }
        printArr(count0,count1,count2);
    }

    static void printArr(int count0, int count1, int count2)
    {
        System.out.println("Sorted Array");
        while(count0 > 0)
        {
            System.out.println(" element : 0");
            count0--;
        }
        while(count1 > 0)
        {
            System.out.println(" element : 1");
            count1--;
        }
        while(count2 > 0)
        {
            System.out.println(" element : 2");
            count2--;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1 };
        int n = arr.length;
        sortArr(arr, n);
    }
}
