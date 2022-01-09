import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        int numOne = 8, numTwo = 13;
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите первое число, затем знак арифметической операции, и второе число.\n"
                + "Разрешенные знаки арифметической операции: \nСложение + \nВычитание - \nУмножение * \nДеление / "
                + "\nВозвести в степень ^ \nПолучить остаток от деления %");
        char sign = scan.next().charAt(0);
        if (sign == '+') {
            System.out.println(numOne + numTwo);
        } else if (sign == '-') {
            System.out.println(numOne - numTwo);
        } else if (sign == '*') {
            System.out.println(numOne * numTwo);
        } else if (sign == '/') {
            System.out.println(numOne / numTwo);
        } else if (sign == '^') {
            int result = 1;
            for (int i = 1; i <= numTwo; i++) {
                result *= numOne;
            }
            System.out.println(result);
        } else {
            System.out.println(numOne % numTwo);
        }
    }
}