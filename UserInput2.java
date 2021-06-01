package com.CodeWithSarnav;

import java.io.DataInputStream;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int a;
        float b;
        Scanner s=new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        a=Integer.parseInt(s.nextLine());
        System.out.print("Enter 2nd number: ");
        b=Float.parseFloat(s.nextLine());
        System.out.print("The numbers are " + a + " and " + b);
    }
}
