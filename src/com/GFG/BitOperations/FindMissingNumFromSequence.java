package com.GFG.BitOperations;

public class FindMissingNumFromSequence {


    public static void main(String[] args) {

        int arr[] = new int[]{1,3,4};
        System.out.println(findMissing(arr));
    }

    static int findMissing(int arr[])
    {
        int missing = 0;
        for(int i =1;i<arr.length;i++)
        {
            missing = arr[i-1] ^ i;
            System.out.println(missing);
        }
        return missing;
    }
}
