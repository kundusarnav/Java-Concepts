package com.CodeWithSarnav;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int b1,d1,s1,p1,b2,d2,s2,p2,r;

        System.out.println("------------------For male------------------");
        System.out.print("Enter number of births: ");
        Scanner s = new Scanner(System.in);
        b1=s.nextInt();
        System.out.print("Enter number of deaths: ");
        d1=s.nextInt();
        System.out.print("Enter population size: ");
        s1=s.nextInt();
        p1=(b1-d1)/s1;
        float k1=(float)p1;
        System.out.println("Population growth for male: "+k1);

        System.out.println("\n------------------For female------------------");
        System.out.print("Enter number of births: ");
        b2=s.nextInt();
        System.out.print("Enter number of deaths: ");
        d2=s.nextInt();
        System.out.print("Enter population size: ");
        s2=s.nextInt();
        p2=(b2-d2)/s2;
        float k2=(float)p2;
        System.out.println("Population growth for female: "+k2);

        r= (int) (k1/k2);
        float k=(float)r;
        System.out.print("\nPopulation growth ratio of male and female: "+k);
    }
}