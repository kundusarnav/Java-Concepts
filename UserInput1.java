package com.CodeWithSarnav;

import java.io.DataInputStream;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int i;
        float j;
        Scanner s=new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        i=s.nextInt();
        System.out.print("Enter 2nd number: ");
        j=s.nextFloat();
        System.out.print("The numbers are "+i+" and "+j);
    }
}
