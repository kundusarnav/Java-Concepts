package com.CodeWithSarnav;

class MyClass{
    int x;

    MyClass(int y){
        x=y;
    }
}

class MyClass2{
    int x;

    MyClass2(){
        x=7;
    }
}
public class Main {

    public static void main(String[] args) {
	// write your code here
        MyClass m=new MyClass(6);
        System.out.print(m.x=9);
        System.out.print(m.x);
        MyClass2 n=new MyClass2();
        System.out.print(n.x);
        System.out.print(n.x=2);
    }
}