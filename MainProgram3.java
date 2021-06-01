package com.CodeWithSarnav;

import java.util.Scanner;

class Employee{
    int empid;
    Employee(){
        System.out.print("Enter employee ID: ");
        Scanner s=new Scanner(System.in);
        empid=s.nextInt();
    }

    void getId(){
        System.out.println("The Employee "+empid+" is marked present.");
    }
}

class SmartCard{
    void getDetails() {
        Employee e = new Employee();
        e.getId();
    }
}
public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("New employee is created.");
        SmartCard sc=new SmartCard();
        sc.getDetails();
    }
}