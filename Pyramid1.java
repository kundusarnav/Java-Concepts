package com.CodeWithSarnav;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int i,j,n;
        System.out.print("Enter number of rows: ");
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        for(i=0;i<n;i++){
            for(j=n-1;j>=i;j--){
                System.out.print(" ");
            }
            for(j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}