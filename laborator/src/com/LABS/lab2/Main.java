package com.LABS.lab2;

public class Main {

    public static void main(String[] args) {
        //ex1
        Box box1 = new Box();
        box1.showBox();

        Box box2 = new Box(4);
        box2.showBox();

        Box box3 = new Box(2, 3, 4);
        box3.showBox();

        //ex2
        Queue q1 = new Queue(10);
        q1.push(5);
        q1.push(56);
        q1.push(234);
        q1.pop();
        System.out.println("First queue");
        q1.printQueue();

        Queue q2 = new Queue();
        q2.push(654);
        q2.push(65);
        q2.push(312);
        q2.pop();
        System.out.println("Second queue");
        q2.printQueue();

        //ex3
        int area = box3.calcSurfaceArea();
        System.out.println("\nSurface area is: " + area);

        int volume = box3.calcVolume();
        System.out.println("Volume is: " + volume + "\n");

        q2.checkIfFull();
        q2.checkIfEmpty();
    }
}
