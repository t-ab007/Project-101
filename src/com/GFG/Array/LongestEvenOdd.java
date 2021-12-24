package com.GFG.Array;

public class LongestEvenOdd {


    public static void main(String[] args) {
        int[] arr = {10,11,20,28,30,38};

        int cnt =1, res =1;

        for(int i = 1; i < arr.length; i++)
        {
            if((arr[i-1]%2==0 && arr[i]%2!=0) ||
                    (arr[i]%2==0 && arr[i-1]%2 != 0))
            {
                cnt++;
                res = Math.max(cnt,res);
            }
            else
                cnt =0;
        }

        System.out.println("Length of Even odd seq : "+res);

    }



}
