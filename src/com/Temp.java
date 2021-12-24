package com;

import java.util.Arrays;

public class Temp {


    public static void main(String[] args) {



        int[] ex = {2,3,2,4,3};
        frequencyCount(ex,5,4);

    }

    public static void frequencyCount(int arr[], int N, int P)
    {
        int[] freq = new int[P];

        for(int i=0;i<N;i++)
        {
            freq[arr[i]-1] += 1;
        }

        Arrays.stream(freq).forEach(System.out::print);

    }
}
