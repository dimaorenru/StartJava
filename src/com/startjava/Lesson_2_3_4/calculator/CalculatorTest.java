package com.startjava.Lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        do {
            calc.calculationData();
            System.out.println(calc.calculate());
        } while (!isExit());
    }

    public static boolean isExit() {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.print("Хотите продолжить вычисления? [yes/no]: ");
            String exit = input.nextLine();
            if ("no".equals(exit)) {
                return true;
            } else if ("yes".equals(exit)) {
                return false;
            } else {
                System.out.println("Введен неверный ответ! Попробуйте еще раз");
            }
        }
    }
}