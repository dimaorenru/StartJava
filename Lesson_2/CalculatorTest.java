import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        String[] option = new String[]{"no", "yes"};
        boolean right = true;

        Calculator calculator = new Calculator();
        while (true) {
            System.out.print("Введите первое число: ");
            Scanner scanner = new Scanner(System.in);

            int numOne = scanner.nextInt();
            calculator.setNumOne(numOne);
            System.out.print("Введите знак математической операции: ");

            char sign = scanner.next().charAt(0);
            calculator.setSign(sign);
            System.out.print("Введите второе число: ");

            int numTwo = scanner.nextInt();
            calculator.setNumTwo(numTwo);
            calculator.calculate();
            String res;

            do {
                System.out.println("Хотите продолжить вычисления? (yes/no)");
                res = scanner.next();
                if (res.equals("no")) {
                    System.out.println("Завершение программы");
                    return;
                }
            } while (!res.equals("yes"));
        }
    }
}