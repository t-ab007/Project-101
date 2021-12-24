package com.GFG.Array;

import java.util.HashMap;

public class ElementFrequencies {


    public static void main(String[] args) {
        Integer[] arr = {1,2,3,2,2,1,1,3,4,2,4};

        HashMap<Integer,Integer> freq = new HashMap<>();

        for(Integer i : arr)
        {
            if(!freq.containsKey(i))
            {
                freq.put(i,1);
            } else {
                freq.put(i,(freq.get(i)+1));
            }
        }

        freq.forEach((v,f) -> System.out.println("Value : "+v+ " Freq : "+f));

    }

}
