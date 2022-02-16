package com.startjava.Lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            createCalculator();
            if (!isNext())
                return;
        }
    }

    private static void createCalculator() {
        Calculator calculator = new Calculator();
        System.out.print("Введите математическое выражение: ");
        System.out.println(calculator.calculate(scan.nextLine()));
    }

    public static boolean isNext() {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.print("Хотите продолжить вычисления? [yes/no]: ");
            String exit = input.nextLine();
            if (exit.equalsIgnoreCase("yes")) {
                return true;
            } else if (exit.equalsIgnoreCase("no")) {
                return false;
            } else {
                System.out.println("Введен неверный ответ! Попробуйте еще раз");
            }
        }
    }
}