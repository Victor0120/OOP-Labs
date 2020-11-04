package com.LABS.lab1;

public class Main {

    public static void main(String[] args) {
        //ex 1
        //created monitors
        Monitor LG = new Monitor("red", 11, 1280*720);
        Monitor Samsung = new Monitor("blue", 20, 1920*1080);
        LG.showMonitor();
        Samsung.showMonitor();

        //updated attributes
        LG.setColor("white");
        LG.setDimension(12);
        LG.setResolution(800*600);

        Samsung.setColor("black");
        Samsung.setDimension(21);
        Samsung.setResolution(1366*768);
        LG.showMonitor();
        Samsung.showMonitor();

        //monitor comparison
        if (LG.color.equals(Samsung.color)){
            System.out.println("The monitors are the same color");
        } else {
            System.out.println("The monitors are different colors");
        }
        if(LG.dimension == Samsung.dimension){
            System.out.println("The same diagonal");
        }
        if(LG.dimension > Samsung.dimension){
            System.out.println("LG screen is bigger");
        }
        if(Samsung.dimension > LG.dimension){
            System.out.println("Samsung screen is bigger");
        }
        if(LG.resolution == Samsung.resolution){
            System.out.println("The same resolution");
        }
        if(LG.resolution > Samsung.resolution){
            System.out.println("LG screen resolution is higher");
        }
        if(Samsung.resolution > LG.resolution){
            System.out.println("Samsung screen resolution is higher");
        }

        //ex 2
        Student utmStudent1 = new Student("Bob", 19, 8);
        Student utmStudent2 = new Student("Ana", 20, 9);
        Student utmStudent3 = new Student("Bill", 21, 10);

        Student[] list1 = {utmStudent1, utmStudent2, utmStudent3};

        University utm = new University("UTM", 1960, list1 );
        utm.showUniversity();
        double medUtm = utm.calcMedian(list1);

        //ex3
        Student usmStudent1 = new Student("Bob", 19, 5);
        Student usmStudent2 = new Student("Ana", 20, 6);
        Student usmStudent3 = new Student("Bill", 21, 7);

        Student[] list2 = {usmStudent1, usmStudent2, usmStudent3};

        University usm = new University("USM", 1965, list2 );
        double medUsm = usm.calcMedian(list2);

        Student asemStudent1 = new Student("Bob", 19, 2);
        Student asemStudent2 = new Student("Ana", 20, 3);
        Student asemStudent3 = new Student("Bill", 21, 2);

        Student[] list3 = {asemStudent1, asemStudent2, asemStudent3};

        University asem = new University("ASEM", 1970, list3 );
        double medAsem = asem.calcMedian(list3);

        System.out.println("UTM media: " + medUtm);
        System.out.println("USM media: " + medUsm);
        System.out.println("Asem media: " + medAsem);
    }
}
