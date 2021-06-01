package com.CodeWithSarnav;

class A{
    int d,e,f;

    A(){
        System.out.println("------------------Defined for class A------------------");
    }

    void set(int a, int b, int c){
        d=a;
        e=b;
        f=c;
    }

    void show(){
        System.out.println("The first input is "+a);
        System.out.println("The second input is "+b);
        System.out.println("The third input is "+c);
    }
}

public class Main {

    public static void main(String[] args) {
        A a1 = new A();
        a1.set(3,5,8);
        a1.show();
    }
}