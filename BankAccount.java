package com.CodeWithSarnav;

import java.util.Scanner;

class A{
    String name,acc;
    int ano,bam;

    void val(){
        String name,acc;
        int ano,bam;
        Scanner s=new Scanner(System.in);
        System.out.print("\nEnter your name: ");
        name=s.next();
        while(!name.matches("[a-zA-Z]+")){
            System.out.println("Not a valid name\nEnter your name: ");
            name = s.next();
        }
        System.out.print("Enter account type: ");
        acc=s.next();
        while(!acc.matches("[a-zA-Z]+")){
            System.out.println("Not a valid account\nEnter your account: ");
            acc = s.next();
        }
        System.out.print("Enter account number: ");
        ano=s.nextInt();
        System.out.print("Enter balance: ");
        bam=s.nextInt();
        this.name=name;
        this.acc=acc;
        this.ano=ano;
        this.bam=bam;
    }

    void deposit(){
        int deposit;
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the amount to be deposited: ");
        deposit=s.nextInt();
        bam=bam+deposit;
    }

    void withdraw(){
        int withdraw;
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the amount to be withdrawn: ");
        withdraw=s.nextInt();
        while(withdraw>bam){
            System.out.print("Amount exceeds balance\nEnter the amount to be withdrawn: ");
            withdraw=s.nextInt();
        }
        bam=bam-withdraw;
    }

    void display(){
        System.out.println("Name: "+name.substring(0, 1).toUpperCase() + name.substring(1));
        System.out.println("Balance: "+bam);
    }
}

public class Main {

    public static void main(String[] args) {
	// write your code here
        int c;
        System.out.println("------------Choice List------------");
        System.out.println("1. Deposit an amount\n2. Withdraw an amount\n3. Display name and balance\n4. Exit");
        Scanner s=new Scanner(System.in);
        A a=new A();
        a.val();
        while(true) {
            System.out.print("\nEnter your choice: ");
            c = s.nextInt();
            switch (c){
                case 1:a.deposit();break;
                case 2:a.withdraw();break;
                case 3:a.display();break;
                case 4:System.exit(0);break;
                default:System.out.print("Invalid choice\n");break;
            }
        }
    }
}