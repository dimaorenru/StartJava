package com.startjava.Lesson_2_3_4.calculator;

import java.util.Scanner;

public class Calculator {
    private int numOne;
    private int numTwo;
    private String mathSign;

    public void calculationData() {
        System.out.print("Введите математическое выражение: ");
        Scanner input = new Scanner(System.in);
        String[] data = input.nextLine().split(" ");
        numOne = Integer.parseInt(data[0]);
        numTwo = Integer.parseInt(data[2]);
        mathSign = data[1];
    }

    public int calculate() {
        switch (mathSign) {
            case "+":
                return (numOne + numTwo);
            case "-":
                return (numOne - numTwo);
            case "*":
                return (numOne * numTwo);
            case "/":
                if (numTwo == 0) {
                    System.out.println("Деление на 0 запрещено!");
                    return -1;
                } else {
                    return (numOne / numTwo);
                }
            case "^":
                return (int) (Math.pow(numOne, numTwo));
            case "%":
                return (numOne % numTwo);
            default:
                System.out.println("Вы ввели не верные данные");
                return -1;
        }
    }
}