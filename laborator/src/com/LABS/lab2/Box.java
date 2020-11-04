package com.LABS.lab2;

public class Box {
    int height = 1;
    int length = 1;
    int width = 1;

    public Box() {

    }

    public Box(int height, int length, int width) {
        this.height = height;
        this.width = width;
        this.length = length;
    }

    public Box(int value) {
        this. height = value;
        this. width = value;
        this. length = value;
    }

    public void showBox() {
        System.out.println("Box parameters are: ");
        System.out.println(this.height);
        System.out.println(this.length);
        System.out.println(this.width+ "\n");
    }

    public int calcSurfaceArea() {
        return 2*(width*length+width*height+height*length);
    }

    public int calcVolume() {
        return width*length*height;
    }
}
