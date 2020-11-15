package com.LABS.lab7;

import java.util.ArrayList;
import java.util.List;

class Circle extends Figure{
    int area = 200;
    int perimeter = 1;

    int getArea(){
        return area;
    }

    int getPerimeter(){
        return perimeter;
    }

    @Override
    public String toString() {
        return "Circle";
    }
}

public class Main {

    public static void main(String[] args) {
        Figure square = new Square();
        Figure rectangle = new Rectangle();
        Figure triangle = new Triangle();

        List<Figure> figureArray = new ArrayList<Figure>();

        figureArray.add(square);
        figureArray.add(rectangle);
        figureArray.add(triangle);

        FigureController controller = new FigureController();
        controller.getMaxArea(figureArray);
        controller.getMaxPerimeter(figureArray);

        System.out.println("Circle area: " +new Circle().getArea()+"cm^2");
        System.out.println("Circle perimeter: "+new Circle().getPerimeter()+"cm");

        figureArray.add(new Circle());
        controller.getMaxArea(figureArray);
        controller.getMaxPerimeter(figureArray);


    }
}
