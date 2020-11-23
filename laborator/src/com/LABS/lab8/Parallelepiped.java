package com.LABS.lab8;

import static java.lang.StrictMath.*;

public class Parallelepiped implements GeometricBody{
    double length = 4;
    double width = 5;
    double height = 6;
    double alpha = 60 * (Math.PI/180);
    double beta = 45 * (Math.PI/180);
    double gamma = 70 * (Math.PI/180);

    public double getSurface() {
        return 2*(length*width*sin(alpha)+length*height*sin(beta)+width*height*sin(gamma));
    }

    public double getVolume() {
        return length*width*height*sqrt(1+2*cos(alpha)*cos(beta)*cos(gamma)-pow(cos(alpha),2)-pow(cos(beta), 2)-pow(cos(gamma),2));

    }

    @Override
    public String toString() {
        return "Parallelepiped";
    }

}
