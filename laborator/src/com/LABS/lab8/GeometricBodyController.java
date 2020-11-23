package com.LABS.lab8;


import java.util.List;

public class GeometricBodyController {
    void getMaxSurfaceArea(List<GeometricBody> array){
        double max = -1;
        int index = -1;
        for (int i = 0; i < array.size(); i++) {
            if(array.get(i).getSurface() > max){
                max = array.get(i).getSurface();
                index = i;
            }
        }
        System.out.println("Figure with max surface area is: " + array.get(index).toString() + " with value " + max + " cm^2");
    }

    void getMaxVolume(List<GeometricBody> array){
        double max = -1;
        int index = -1;
        for (int i = 0; i < array.size(); i++) {
            if(array.get(i).getVolume() > max){
                max = array.get(i).getVolume();
                index = i;
            }
        }
        System.out.println("Figure with max volume is: " + array.get(index).toString() + " with value " + max + " cm^3");
    }
}
