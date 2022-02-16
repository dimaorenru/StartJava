package com.startjava.Lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        createCalculator();
        isNext();
    }

    private static void createCalculator() {
        Calculator calculator = new Calculator();
        System.out.print("Введите математическое выражение: ");
        System.out.println(calculator.calculate(scan.nextLine()));
    }

    private static void isNext() {
        String answer;
        do {
            System.out.print("Хотите продолжить вычисления? [yes/no]: ");
            answer = scan.nextLine();
            if (answer.equals("yes")) {
                createCalculator();
            } else if (answer.equals("no")) {
                System.out.println("Завершение программы");
                break;
            }
        } while (!answer.equals("yes") || !answer.equals("no"));
    }
}