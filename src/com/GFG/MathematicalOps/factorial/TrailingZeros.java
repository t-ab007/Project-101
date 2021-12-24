package com.GFG.MathematicalOps.factorial;

public class TrailingZeros {


    public static void main(String[] args) {

        System.out.println(getFacttrailingZeroCount(5));
        System.out.println(getFacttrailingZeroCount(10));
        System.out.println(getFacttrailingZeroCount(100));
    }

    static int getFacttrailingZeroCount(int n)
    {
        double fact = Factorial.getFactorialByIteraionL(n);
        int count = 0;

        while(fact%10 == 0) {
            count++;
            fact /= 10;
        }

        return count;
    }
}
