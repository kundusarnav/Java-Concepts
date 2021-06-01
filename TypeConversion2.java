package com.CodeWithSarnav;

public class Main {

    public static void main(String[] args) {
	// write your code here
        char c='d';
        byte b=50;
        short s=1996;
        int i=123456789;
        long l=73673216984212l;
        float f1=3.142f;
        float f2=1.2e-5f;
        double d=73.7383;
        System.out.println("--------------Data Types--------------");
        System.out.println("c="+c);
        System.out.println("b="+b);
        System.out.println("s="+s);
        System.out.println("i="+i);
        System.out.println("l="+l);
        System.out.println("f1="+f1);
        System.out.println("f2="+f2);
        System.out.println("d="+d);
        System.out.println();

        short s1=(short)b;
        short s2=(short)i;
        float n1=(float)l;
        int m1=(int)f1;
        System.out.println("--------------Types Converted--------------");
        System.out.println("(short)b="+s1);
        System.out.println("(short)i="+s2);
        System.out.println("(float)l="+n1);
        System.out.println();
    }
}
