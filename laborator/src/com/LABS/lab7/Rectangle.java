package com.LABS.lab7;

 class Rectangle extends Figure{
     int length = 20;
     int width = 10;

     double getArea(){
         return length*width;
     }

     double getPerimeter(){
         return 2*(length+width);
     }

     @Override
     public String toString() {
         return "Rectangle";
     }
 }
