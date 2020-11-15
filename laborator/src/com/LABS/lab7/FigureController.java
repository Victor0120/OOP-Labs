package com.LABS.lab7;

import java.util.List;

public class FigureController {
    void getMaxArea(List<Figure> array){
        int max = -1;
        int index = -1;
        for (int i = 0; i < array.size(); i++) {
            if(array.get(i).getArea() > max){
                max = array.get(i).getArea();
                index = i;
            }
        }
        System.out.println("Figure with max area is: " + array.get(index).toString() + " with value " + max + " cm^2");
    }

    void getMaxPerimeter(List<Figure> array){
        int max = -1;
        int index = -1;
        for (int i = 0; i < array.size(); i++) {
            if(array.get(i).getPerimeter() > max){
                max = array.get(i).getPerimeter();
                index = i;
            }
        }
        System.out.println("Figure with max area is: " + array.get(index).toString() + " with value " + max + " cm^2");
    }
}
