import java.util.Scanner;
import java.util.Random;
import java.util.InputMismatchException;

public class GuessNumber {
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();
    private int guessNumber;
    private int attempt;
    private Player player1;
    private Player player2;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public boolean tryEnterNum(String playerName) {
        System.out.println("Попытка № " + attempt + " игрока - " + playerName);
        System.out.println("Введите число");
        int inputNumber1 = scanner.nextInt();
        if (inputNumber1 == guessNumber) {
            System.out.println("Выиграл " + playerName);
            attempt = 0;
            return true;
        } else if(inputNumber1 > guessNumber) {
            System.out.println("Введенное вами число больше того, что загадал компьютер");
        } else {
            System.out.println("Введенное вами число меньше того, что загадал компьютер");
        }
        return false;
    }

    public void start() {
        guessNumber = random.nextInt(100) + 1;
        try {
            while(true) {
                attempt++;
                if (tryEnterNum(player1.getName())) {
                    break;
                }
                if (tryEnterNum(player2.getName())) {
                    break;
                }
            }
        } catch(InputMismatchException e) {
            System.out.println("Вы ввели неверные данные");
        }
    }
}