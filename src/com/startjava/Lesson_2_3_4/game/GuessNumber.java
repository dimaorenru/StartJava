package com.startjava.Lesson_2_3_4.game;

import java.util.Scanner;
import java.util.Random;

public class GuessNumber {
    Scanner scanner = new Scanner(System.in);
    private int guessNumber;
    private Player player1;
    private Player player2;
    public int attempt;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
        Random random = new Random();
        guessNumber = random.nextInt(100) + 1;
    }

    public void start() {
        while(true) {
            attempt++;
            if (makeMove(player1.getName())) {
                break;
            }
            if (makeMove(player2.getName())) {
                break;
            }
        }
    }

    private boolean makeMove(String playerName) {
        System.out.println("Попытка № " + attempt + " игрока - " + playerName);
        System.out.println("Введите число");
        int inputNumber = scanner.nextInt();
        if (inputNumber == guessNumber) {
            System.out.println("Выиграл " + playerName);
            return true;
        }
        if (inputNumber > guessNumber) {
            System.out.println("Введенное вами число больше того, что загадал компьютер");
        } else {
            System.out.println("Введенное вами число меньше того, что загадал компьютер");
        }
        return false;
    }
}