package com;

public class Question1 {


    public static void main(String[] args) {
        String input = "dwsrrrrrmkdrrr";
        String word = "rr";

        System.out.println(getCount(input,word));

    }

    static int getCount(String input, String word)
    {
        int count = 0;
        int framesize = word.length();
        String s = "";
        for(int i = 0;i<input.length();i++)
        {
           for(int j=i,k=0;k<framesize&&j<input.length();k++,j++)
           {
               if(k==0)
               {
                   s = input.charAt(j)+"";
               }
               else
               {
                   s = s+input.charAt(j);
               }
               if(s.equals(word))
               {
                   count++;
               }
           }
        }
        return count;
    }
}
