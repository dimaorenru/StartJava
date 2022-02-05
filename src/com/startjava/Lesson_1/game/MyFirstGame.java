package com.startjava.lesson_1.game;

import java.util.Scanner;

public class MyFirstGame {
    public static void main(String[] args) {
        int secretNum = (int) ((Math.random() * 100) + 1);
        System.out.println("Компьютер загадывает число от 0 до 100.");
        Scanner console = new Scanner(System.in);
        int playerNum;

        do {
            playerNum = console.nextInt();
            if (playerNum > secretNum) {
                System.out.println("Введенное вами число больше того, что загадал компьютер.");
            } else if (playerNum < secretNum){
                System.out.println("Введенное вами число меньше того, что загадал компьютер.");
            }
        } while (playerNum != secretNum);
        System.out.println("Поздравляем, число угадано!");
    }
}