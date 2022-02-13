package com.startjava.Lesson_1.cycle;

public class Cycle {

    public static void main(String[] args) {
        for(int i = 0; i < 21; i++) {
            System.out.println(i);
        }

        int num = -6;
        while(num < 7) {
            System.out.println(num);
            num += 2;
        }

        int counter = 10;
        int sumOdd = 0;
        do {
            if(counter % 2 != 0)
                sumOdd += counter;
                counter++;
        } while(counter <= 20);
        System.out.println("Сумма нечетных чисел: " + sumOdd);
    }
}