package com.startjava.Lesson_2_3_4.game;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    Random random = new Random();
    private int guessNumber;
    private Player player1;
    private Player player2;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    void start() {
        guessNumber = random.nextInt(100) + 1;
        System.out.println("Введите числа от 0 до 100. У вас 10 попыток");
        int attempt;
        for (attempt = 0; attempt < 10; attempt++) {
            inputNumber(player1, attempt);
            if (checkNumber(player1, attempt)) {
                break;
            }
            inputNumber(player2, attempt);
            if (checkNumber(player2, attempt)) {
                break;
            }
        }
        if (attempt == 9) {
            System.out.println("У " + player1.getName() + " закончились попытки");
            System.out.println("У " + player2.getName() + " закончились попытки");
            System.out.println("Загаданное число - " + guessNumber);
        }
        outputNumbers(player1.getNumbers(attempt));
        outputNumbers(player2.getNumbers(attempt));
        player1.resetArray(attempt);
        player2.resetArray(attempt);
    }

    private void inputNumber(Player player, int index) {
        System.out.println("Попытка " + (index + 1) + " игрока " + player.getName());
        int number = new Scanner(System.in).nextInt();
        player.setNumber(number, index);
    }

    private boolean checkNumber(Player player, int index) {
        if (player.getNumber(index) == guessNumber) {
            System.out.println("Игрок " + player.getName() + " угадал число " + player.getNumber(index) + " с " + (index + 1) + " попытки");
            return true;
        }
        String check = player.getNumber(index) > guessNumber ? "больше" : "меньше";
        System.out.println("Введенное вами число " + check + " того, что загадал компьютер");
        return false;
    }

    private void outputNumbers(int[] numbers) {
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
}