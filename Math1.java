package com.CodeWithSarnav;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int x,y;
        Scanner s=new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        x=s.nextInt();
        System.out.print("Enter 2nd number: ");
        y=s.nextInt();
        System.out.println("Maximum number is "+Math.max(x,y));
        System.out.println("Minimum number is "+Math.min(x,y));
        System.out.println("Power value is "+Math.pow(x,y));
        System.out.println("Natural log is "+Math.log(x)+" and "+Math.log(y));
        System.out.println("Square root of is "+Math.sqrt(x)+" and "+Math.sqrt(y));
        System.out.println("Absolute value is "+Math.abs(x)+" and "+Math.abs(y));
        System.out.println("The pseudo random double type integer between 0 and 1 is "+Math.random());
    }
}