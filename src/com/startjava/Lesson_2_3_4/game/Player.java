package com.startjava.Lesson_2_3_4.game;

import java.util.Arrays;

public class Player {
    private String name;
    private int[] numbers = new int[10];

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setNumber(int number, int index) {
        numbers[index] = number;
        if (number < 0 || number > 100) {
            System.out.println("Вы ввели число вне указанного диапазона");
        }
    }

    public int[] getNumbers(int index) {
        return Arrays.copyOf(numbers, index);
    }

    public int getNumber(int index) {
        return numbers[index];
    }

    public void resetArray(int index) {
        Arrays.fill(numbers, 0, index, 0);
    }
}