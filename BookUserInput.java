package com.CodeWithSarnav;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int i,n,a,j;
        System.out.print("Enter number of pages: ");
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        System.out.print("Enter number of lines: ");
        i=s.nextInt();
        System.out.print("Enter number of words per line: ");
        a=s.nextInt();
        j=i*n*a;
        System.out.print("Total number of words in book: "+j);
    }
}
