package com.LABS.lab8;

public class Sphere implements GeometricBody{
    int radius = 9;

    public double getSurface() {
         return 4*Math.PI*Math.pow(radius, 2);
     }

    public double getVolume() {
        return(4*Math.PI*Math.pow(radius, 3))/3;
     }

    @Override
    public String toString() {
        return "Sphere";
    }

}
