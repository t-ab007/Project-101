package com.string;

public class TestImm {





    static class Test{
        private Integer i;

        public Test(Integer i)
        {
            this.i = i;
        }

        public Test modifyData(int i)
        {
            return (this.i == i)?this:new Test(i);
        }

    }

    public static void main(String[] args) {

        String s = "durga";
        String s1 = s.toString();

        String s3 = s.toUpperCase();

        System.out.println(s==s1);
//        System.out.println(s==s2);
        System.out.println(s==s3);

        final StringBuffer sb = new StringBuffer("test 123");
        System.out.println(sb.capacity());
        sb.append(" Completed1111111111111111");
        System.out.println(sb.capacity());
        System.out.println(sb);

        StringBuffer sb1 = new StringBuffer();
        System.out.println(sb1.capacity());

        Test t = new Test(10);
        Test t2 = t.modifyData(100);
        Test t3 = t.modifyData(10);

        System.out.println(t==t2);
        System.out.println(t==t3);


    }

}
