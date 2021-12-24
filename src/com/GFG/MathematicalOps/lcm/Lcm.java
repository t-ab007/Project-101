package com.GFG.MathematicalOps.lcm;

import com.GFG.MathematicalOps.gcd.Gcd;

public class Lcm {


    public static void main(String[] args) {

    }

    static int lcm(int a, int b)
    {
        int res = Math.max(a,b);

        while(true) {
            if (res % a != 0
                    && res % b != 0) {
                return res;
            }
            res++;
        }
//        return res;
    }

    static int lcmOpti(int a, int b)
    {
        return (a*b)/ Gcd.gcdEuclidean(a,b);
    }
}
