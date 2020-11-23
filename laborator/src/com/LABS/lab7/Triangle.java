package com.LABS.lab7;

import static java.lang.Math.sqrt;

class Triangle extends Figure{
     int edgeA = 5;
     int edgeB = 6;
     int edgeC = 7;

     double getArea() {
         int semiPerimeter = (edgeA+edgeB+edgeC)/2;
         return sqrt(semiPerimeter*(semiPerimeter-edgeA)*(semiPerimeter-edgeB)*(semiPerimeter-edgeC));
     }

    double getPerimeter(){
         return edgeA+edgeB+edgeC;
     }

     @Override
     public String toString() {
         return "Triangle";
     }
}
