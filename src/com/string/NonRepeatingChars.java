package com.string;


import java.io.PrintStream;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

public class NonRepeatingChars {

    public static void main(String[] args) {
        String test = "aabbsjdinenns";

        char[] count = new char[256];

//        System.out.println("Original Count arr : ");
//        for (char c:count)
//        {
//            System.out.print((char)c+" ");
//        }
        for(Character c : test.toCharArray())
        {
            count[c]++;
        }

//        System.out.println("\nAfter adding count : ");

        int index = -1;
        for (int i = 0;i<test.length();i++)
        {
            if(count[test.charAt(i)]==1)
            {
                index = i;
                break;
            }
        }
        System.out.println(test.toCharArray());
        if(index != -1)
            System.out.println("NonRepeating char found at : "+index);

        char[] c = new char[8];
        c[0] = 'a';
        c[1] ='n';
        c[2] = 'i';
        c[3] = 'k';
        c[4] = 'e';
        c[5] = 't';
        c[0]++;
        System.out.println(c);


    }



}
