package com.LABS.lab7;

 class Rectangle extends Figure{
     int area = 20;
     int perimeter = 2;

     int getArea(){
         return area;
     }

     int getPerimeter(){
         return perimeter;
     }

     @Override
     public String toString() {
         return "Rectangle";
     }
 }
