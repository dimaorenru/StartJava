public class Calculator {

    public static void main(String[] args) {
        System.out.println("Введите первое число, затем знак арифметической операции, и второе число.\n"
                + "Разрешенные знаки арифметической операции: \nСложение + \nВычитание - \nУмножение * \nДеление / "
                + "\nВозвести в степень ^ \nПолучить остаток от деления %");
        int numOne = 8;
        int numTwo = 13;
        int result = 0;
        char sign  = '^';

        if(sign  == '+') {
            result = numOne + numTwo;
        } else if(sign  == '-') {
            result = numOne - numTwo;
        } else if(sign  == '/') {
            if(numTwo != 0) {
                result = numOne / numTwo;
            }
        } else if(sign  == '*') {
            result = numOne * numTwo;
        } else if(sign  == '%') {
            result = numOne % numTwo;
        } else if(sign  == '^') {
            result = numOne;
            for(int i = 2; i <= numTwo; i++) {
                result *= numOne;
            }
        }
        System.out.println(result);
    }
}