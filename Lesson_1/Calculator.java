import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        int numOne = 8, numTwo = 13;
        while(true) {
            int result = 1;
            Scanner scan = new Scanner(System.in);
            System.out.println("Введите первое число, затем знак арифметической операции, и второе число.\n"
                    + "Разрешенные знаки арифметической операции: \nСложение + \nВычитание - \nУмножение * \nДеление / "
                    + "\nВозвести в степень ^ \nПолучить остаток от деления %");
            numOne = scan.nextInt();
            char sign = scan.next().charAt(0);
            numTwo = scan.nextInt();
            if (sign == '+') {
                result = numOne + numTwo;
            } else if (sign == '-') {
                result = numOne - numTwo;
            } else if (sign == '*') {
                result = numOne * numTwo;
            } else if (sign == '/') {
                result = numOne / numTwo;
            } else if (sign == '^') {
                result = 1;
                for (int i = 1; i <= numTwo; i++) {
                    result *= numOne;
                }
            } else if (sign == '%') {
                result = numOne % numTwo;
            }
            else {
                System.out.println("Немогу вычислить");
                continue;
            }
            System.out.println(result);
        }
    }
}