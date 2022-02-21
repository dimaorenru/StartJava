package com.startjava.Lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        do {
            createCalculator();
        } while(isNext());
    }

    private static void createCalculator() {
        Calculator calculator = new Calculator();
        System.out.print("Введите математическое выражение: ");
        System.out.println(calculator.calculate(scan.nextLine()));
    }

    public static boolean isNext() {
        Scanner input = new Scanner(System.in);
        String option;
        do {
            System.out.print("Хотите продолжить вычисления? [yes/no]: ");
            option = input.nextLine();
            if ("yes".equalsIgnoreCase(option))
                return true;
        } while (!"no".equals(option));
        return false;
    }
}