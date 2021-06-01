package com.CodeWithSarnav;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int i,n,j=0,k=1,l;
        Scanner s=new Scanner(System.in);
        System.out.print("Enter length of numbers: ");
        n=s.nextInt();
        System.out.print(j+" "+k);
        for(i=0;i<n-2;i++){
            l=j+k;
            System.out.print(" "+l);
            j=k;
            k=l;
        }
    }
}
