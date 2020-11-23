package com.LABS.lab7;

 class Square extends Figure{
     int edge = 10;

     double getArea(){
         return edge*edge;
     }

     double getPerimeter(){
         return 4*edge;
     }

     @Override
     public String toString() {
         return "Square";
     }
}
