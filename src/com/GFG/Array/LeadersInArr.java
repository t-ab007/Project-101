package com.GFG.Array;

public class LeadersInArr {


    public static void main(String[] args) {

        int[] arr = {7,10,4,3,6,5,2};
        int[] arr1 = {10,20,30};
        int[] arr2 = {30,20,10};

        System.out.println("11111111111111111");
        printLeaders(arr);
        System.out.println();

        System.out.println("222222222222222222");
        printLeaders(arr1);
        System.out.println();

        System.out.println("3333333333333333");
        printLeaders(arr2);
    }

    public static void printLeaders(int[] arr)
    {
        System.out.println("LEADERS");
        System.out.print(arr[arr.length-1]+" ");

        int maxval = arr[arr.length-1];
        for(int i =(arr.length-2);i>=0;i--)
        {
            if(arr[i]>maxval)
            {
                System.out.print(arr[i]+" ");
                maxval = arr[i];
            }
        }
    }

}
