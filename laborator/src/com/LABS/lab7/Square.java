package com.LABS.lab7;

 class Square extends Figure{
     int area = 10;
     int perimeter = 50;

     int getArea(){
         return area;
     }

     int getPerimeter(){
         return perimeter;
     }

     @Override
     public String toString() {
         return "Square";
     }
}
