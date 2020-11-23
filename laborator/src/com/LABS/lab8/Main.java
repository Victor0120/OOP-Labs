package com.LABS.lab8;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Cube cube = new Cube();
        Sphere sphere = new Sphere();
        Parallelepiped parallelepiped = new Parallelepiped();

        List<GeometricBody> bodyArray = new ArrayList<>();

        bodyArray.add(cube);
        bodyArray.add(sphere);
        bodyArray.add(parallelepiped);

        GeometricBodyController controller = new GeometricBodyController();
        controller.getMaxSurfaceArea(bodyArray);
        controller.getMaxVolume(bodyArray);

    }
}