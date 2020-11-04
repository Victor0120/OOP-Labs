package com.LABS.lab1;


public class University {
    String name;
    int foundationYear;
    Student[] list;

    public University(String name, int foundationYear, Student[] studentList) {
        this.name = name;
        this.foundationYear = foundationYear;
        this.list = studentList;
    }

     public void showUniversity() {
         System.out.println(this.name);
         System.out.println(this.foundationYear);
         for (Student element : list) {
             System.out.println(element.name);
         }
     }

     public double calcMedian(Student[] list) {
        double total = 0;
        double median;
        for (Student element: list) {
            total = total + element.mark;
        }
        median = total / list.length;
        return median;
     }
}
