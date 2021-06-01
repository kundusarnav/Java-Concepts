package com.CodeWithSarnav;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int i,j,n,a[]=new int[10],temp;
        Scanner s=new Scanner(System.in);
        System.out.print("Enter size of array: ");
        n=s.nextInt();
        for(i=0;i<n;i++)
        {
            System.out.print("Enter element "+(i+1)+": ");
            a[i]=s.nextInt();
        }
        System.out.print("\nGiven list:");
        for(i=0;i<n;i++)
            System.out.print(" "+a[i]);
        for(j=0;j<n-1;j++)
        {
            for (i=0;i<n-1;i++)
            {
                if (a[i+1]<a[i])
                {
                    temp=a[i];
                    a[i]=a[i+1];
                    a[i+1]=temp;
                }
            }
        }
        System.out.print("\nAscending order:");
        for(i=0;i<n;i++)
            System.out.print(" "+a[i]);
        System.out.print("\nDescending order:");
        for(i=n-1;i>=0;i--)
            System.out.print(" "+a[i]);
    }
}