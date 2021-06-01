package com.CodeWithSarnav;

class A{
    int a,b,c;

    A(){
        System.out.println("------------------Defined for class A------------------");
    }

    void set(int a, int b, int c){
        this.a=a;
        this.b=b;
        this.c=c;
    }

    void show(){
        System.out.println("The first input is "+a);
        System.out.println("The second input is "+b);
        System.out.println("The third input is "+c);

    }
}

class B extends A{
    int d,e;

    B(){
        System.out.println("------------------Defined for class B------------------");
    }

    void set(int a, int b, int c, int d, int e){
        this.a=a;
        this.b=b;
        this.c=c;
        this.d=d;
        this.e=e;
    }

    void show(){
        System.out.println("The first input is "+a);
        System.out.println("The second input is "+b);
        System.out.println("The second input is "+c);
        System.out.println("The first input is "+d);
        System.out.println("The second input is "+e);
    }
}

public class Main {

    public static void main(String[] args) {
	// write your code here
        A a = new A();
        a.set(3,5,8);
        a.show();
        System.out.println();

        B b = new B();
        b.set(7,8,8,44,44);
        b.show();
    }
}