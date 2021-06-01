package com.CodeWithSarnav;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int i,j,n;
        Scanner s=new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        n=s.nextInt();
        for (j=1;j<=n;j++){
        for(i=1;i<=n;i++) {
            System.out.print(i + "\t");
        }
        System.out.println();
        }
    }
}
