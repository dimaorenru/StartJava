public class Cycle {

    public static void main(String[] args) {
        for(int i = 0; i < 21; i++) {
            System.out.println(i);
        }

        int num = -6;
        while(num < 7) {
            System.out.println(num);
            num += 2;
        }

        int theNumbers = 10;
        int sumOdd = 0;
        do {
            if(theNumbers % 2 != 0)
                sumOdd += theNumbers;
                theNumbers++;
        } while(theNumbers <= 20);
        System.out.println("Сумма нечетных чисел: " + sumOdd);
    }
}