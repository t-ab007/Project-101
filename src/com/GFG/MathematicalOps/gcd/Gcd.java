package com.GFG.MathematicalOps.gcd;

public class Gcd {

    public static void main(String[] args) {


        System.out.println(gcd(10,15));
        System.out.println(gcdEuclidean(10,15));
    }


    public static int gcd(int a, int b)
    {
        if(b==0)
            return a;
        else
            return gcd(b, a%b);
    }

     public static int gcdEuclidean(int x, int y)
    {
        while(x != y)
        {
            if(x>y)
                x -= y;
            else
                y -= x;
        }

        return x;
    }

}

