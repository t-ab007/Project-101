package com.array.reverseArr;

public class ReverseArray {

    private static void printArray(int[] arr, int end)
    {
        int i = 0;
        while(i<end)
        {
            System.out.println("index :"+i+"  data :"+arr[i]);
            i++;
        }
    }

    //end param is 0 based value
    public static void reverseArray(int[] arr, int start, int end)
    {
        int temp;
        while(start < end)
        {
            //swap
            temp = arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6};
        printArray(arr, 6);
        reverseArray(arr, 0, 5);
        System.out.print("Reversed array is \n");
        printArray(arr, 6);
    }
}
