package com.LABS.lab1;

public class Monitor {
    public String color;
    public int dimension;
    public int resolution;

    public Monitor(String color, int dimension, int resolution) {
        this.color = color;
        this.dimension = dimension;
        this.resolution = resolution;
    }

    public Monitor() {

    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setDimension(int dimension) {
        this.dimension = dimension;
    }

    public void setResolution(int resolution) {
        this.resolution = resolution;
    }

    public String getColor() {
        return color;
    }

    public int getDimension() {
        return dimension;
    }

    public int getResolution() {
        return resolution;
    }

    public void showMonitor() {
        System.out.println(this.color);
        System.out.println(this.dimension + " inch");
        System.out.println(this.resolution + " pixels \n");
    }
}
