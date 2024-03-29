package com.array.maxOcc;

public class maxOccured {

    public static void main(String[] args) {

        int L[] = {1,4,3,1};
        int R[] = {15,8,5,4};

        System.out.println(maxOccured.maxOccured(L,R,L.length,R.length));


    }

    public static int maxOccured(int L[], int R[], int n, int maxx){

        int[] arr = new int[2000000];

        int maxi=-1;
        for (int i = 0; i < n; i++) {
            arr[L[i]] += 1;
            arr[R[i] + 1] -= 1;
            if(R[i]>maxi){
                maxi=R[i];
            }
        }

        int msum = arr[0];
        int ind = 0;
        for (int i = 1; i < maxi+1; i++) {
            arr[i] += arr[i - 1];
            if (msum < arr[i]) {
                msum = arr[i];
                ind = i;
            }
        }

        return ind;


    }

}
