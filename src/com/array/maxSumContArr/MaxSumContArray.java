package com.array.maxSumContArr;

public class MaxSumContArray {

    static int maxSubArraySum(int[] arr)
    {
        int max_till=Integer.MIN_VALUE, max_temp =0;

        for (int i =0;i<arr.length;i++)
        {
            max_temp = max_temp + arr[i];
            if(max_till < max_temp)
                max_till = max_temp;
            if(max_temp < 0)
                max_temp = 0;
        }

        return max_till;
    }

    public static void main(String[] args) {
        int[] a= {-2, -3, 4, -1, -2, 1, 5, -3};
        System.out.println("Maximum contiguous sum is " +
                maxSubArraySum(a));
    }
}
