package com.GFG.MathematicalOps.palindrom;

public class Numbers {
    public static void main(String[] args) {

        System.out.println(isPal(123));
        System.out.println(isPal(1331));
        System.out.println(isPal(1234234));
        System.out.println(isPal(111111));
        System.out.println(isPal(14444));

    }

    static boolean isPal(int n)
    {
        int rev = 0,i;
        int temp = n;

        while(temp!=0)
        {
            i = temp%10;
            rev = (rev*10)+i;
            temp /= 10;
        }
        System.out.println(rev);
        return n == rev;
    }
}
