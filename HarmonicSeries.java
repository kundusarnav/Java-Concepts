package com.CodeWithSarnav;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        float k=0,d;
        int n;
        Scanner s=new Scanner(System.in);
        System.out.print("Enter number of fractions in harmonic series: ");
        n=s.nextInt();
        for(d=1;d<=n;d++)
            k=k+1/d;
        System.out.print("Sum of harmonic series is "+k);
    }
}
