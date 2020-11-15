package com.LABS.lab7;

 class Triangle extends Figure{
     int area = 5;
     int perimeter = 30;

     int getArea(){
         return area;
     }

     int getPerimeter(){
         return perimeter;
     }

     @Override
     public String toString() {
         return "Triangle";
     }
}
