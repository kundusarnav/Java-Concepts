package com.CodeWithSarnav;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int i,j,n = 0;
        Scanner s=new Scanner(System.in);
        System.out.print("Enter number of cities: ");
        n=s.nextInt();
        String name[] = new String[n],temp;
        System.out.print("Enter name of cities:\n");
        for(i=0;i<n;i++)
            name[i]=s.next();
        for(i=0;i<n;i++)
        {
            for(j=i+1;j<n;j++)
                if(name[i].compareTo(name[j])>0)
                {
                    temp=name[i];
                    name[i]=name[j];
                    name[j]=temp;
                }
        }
        for(i=0;i<n;i++)
            System.out.println(name[i]);
    }
}