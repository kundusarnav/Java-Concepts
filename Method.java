package com.CodeWithSarnav;
class Room{
    float length, breadth;
    void getData(float a,float b){
        length=a;
        breadth=b;
    }
}
public class Main {

    public static void main(String[] args) {
	// write your code here
        float area;
        Room room=new Room();
        room.getData(25,15);
        area=room.length* room.breadth;
        System.out.println("Area= "+area);
    }
}