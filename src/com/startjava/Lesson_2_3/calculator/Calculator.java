package com.startjava.lesson_2_3.calculator;

public class Calculator {
    private int numOne;
    private int numTwo;
    private int result;
    private char sign;

    void setNumOne(int numOne) {
        this.numOne = numOne;
    }

    void setNumTwo(int numTwo) {
        this.numTwo = numTwo;
    }

    void setSign(char sign) {
        this.sign = sign;
    }

    public void calculate() {
        switch(sign) {
            case '+' :
                System.out.println(numOne + numTwo);
                break;
            case '-' :
                System.out.println(numOne - numTwo);
                break;
            case '*' :
                System.out.println(numOne * numTwo);
                break;
            case '/' :
                System.out.println(numOne / numTwo);
                break;
            case '^' :
                result = numOne;
                for(int i = 2; i <= numTwo; i++) {
                    result *= numOne;
                }
                System.out.println(result);
                break;
            case '%' :
                System.out.println(numOne % numTwo);
                break;
            default:
                System.out.println("неизвестная операция");
        }
    }
}