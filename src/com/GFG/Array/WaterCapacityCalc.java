package com.GFG.Array;

public class WaterCapacityCalc {


    public static void main(String[] args) {

        int[] arr = {4,2,0,1,3,6};

        int maxCapacityPerCell = Math.min(arr[0],arr[arr.length-1]);

//        if(arr[1]>arr[0])
//        {
//            maxCapacityPerCell = Math.min(arr[1],arr[arr.length-1]);
//        }
//        if(arr[arr.length-1]<arr[arr.length-2])

        int storageCap = 0;

        for(int i = 1;i<arr.length-1;i++)
        {
            if(!(maxCapacityPerCell<arr[i]))
            {
                storageCap += maxCapacityPerCell-arr[i];
            }
        }

        System.out.println("Storage Capacity : "+storageCap);

    }



}
