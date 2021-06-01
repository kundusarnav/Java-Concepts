package com.CodeWithSarnav;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int i,j,k,n;
        Scanner s=new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        n=s.nextInt();
        for(i=0;i<n-1;i++){
            for(j=n-1;j>i;j--){
                System.out.print(" ");
            }
            for(j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(i=0;i<n;i++){
            for(j=0;j<i;j++){
                System.out.print(" ");
            }
            for(k=n-1;k>=i;k--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}