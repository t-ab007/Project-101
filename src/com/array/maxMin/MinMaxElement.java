package com.array.maxMin;

public class MinMaxElement {

    static class Pair
    {
        int min;
        int max;
    }

    static Pair getMinMax(int[] arr, int size)
    {
        Pair minmax = new Pair();

        //if size = 1
        if(size == 1)
        {
            minmax.min = arr[0];
            minmax.max = arr[0];
            return minmax;
        }

        //initializing min max when size is more than 1 ele
        if(arr[0]<arr[1])
        {
            minmax.min = arr[0];
            minmax.max = arr[1];
        }else
        {
            minmax.min = arr[1];
            minmax.max = arr[0];
        }

        for(int i = 2; i < size; i++)
        {
            if(arr[i] > minmax.max)
            {
                minmax.max = arr[i];
            } else if(arr[i] < minmax.min)
            {
                minmax.min = arr[i];
            }
        }

        return minmax;
    }

    public static void main(String[] args) {
        int arr[] = {1000, 11, 445, 1, 330, 3000};
        int arr_size = 6;
        Pair minmax = getMinMax(arr, arr_size);
        System.out.printf("\nMinimum element is %d", minmax.min);
        System.out.printf("\nMaximum element is %d", minmax.max);
    }
}
