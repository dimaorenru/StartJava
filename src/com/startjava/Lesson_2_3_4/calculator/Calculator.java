package com.startjava.Lesson_2_3_4.calculator;

public class Calculator {
    public int calculate(String mathExpression) {
        int result = 0;
        String[] partsExpression = mathExpression.split(" ");

        int numOne = Integer.parseInt(partsExpression[0]);
        char mathSign = partsExpression[1].charAt(0);
        int numTwo = Integer.parseInt(partsExpression[2]);

        switch (mathSign) {
            case '+':
                return Math.addExact(numOne, numTwo);
            case '-':
                return Math.subtractExact(numOne, numTwo);
            case '*':
                return Math.multiplyExact(numOne, numTwo);
            case '/':
                return Math.floorDiv(numOne, numTwo);
            case '^':
                return (int) Math.pow(numOne, numTwo);
            case '%':
                return Math.floorMod(numOne ,numTwo);
            default:
                System.out.println("Вы ввели не верные данные");
        }
        return result;
    }
}