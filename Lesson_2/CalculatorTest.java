import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        String answer = "yes";
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);

        do {
            if (answer.equalsIgnoreCase("yes")) {
                System.out.print("Введите первое число: ");
                int numOne = scanner.nextInt();
                calculator.setNumOne(numOne);

                System.out.print("Введите знак математической операции: ");
                char sign = scanner.next().charAt(0);
                calculator.setSign(sign);

                System.out.print("Введите второе число: ");
                int numTwo = scanner.nextInt();
                calculator.setNumTwo(numTwo);
                calculator.calculate();
            }
            System.out.println("Хотите продолжить вычисления? (yes/no)");
            answer = scanner.next();
        } while (!answer.equalsIgnoreCase("no"));
        System.out.println("Завершение программы");
    }
}