package com.LABS.lab8;

class Cube implements GeometricBody {
    int edgeLength = 6;

    public double getSurface() {
        return 6*Math.pow(edgeLength,2);
    }

    public double getVolume() {
        return Math.pow(edgeLength,3);
    }

    @Override
    public String toString() {
        return "Cube";
    }
}
