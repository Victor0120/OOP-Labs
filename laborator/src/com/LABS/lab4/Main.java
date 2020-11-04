package com.LABS.lab4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Evaluator eval = new Evaluator();
        Scanner scanner1 = new Scanner(Main.class.getResourceAsStream("one_expression.txt"));
        Scanner scanner2 = new Scanner(Main.class.getResourceAsStream("three_expressions.txt"));

        System.out.println("===First file===");
        String exp1 = scanner1.nextLine();
        eval.evaluate(exp1);

        System.out.println("===Second file===");
        for (int i = 0; i < 3; i++) {
            String exp2 = scanner2.nextLine();
            eval.evaluate(exp2);
        }
    }
}
