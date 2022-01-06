public class Cycle {

    public static void main(String[] args){
        for(int i = 0; i < 21; i++){
            System.out.println(i);
        }

        int num = -6;
        while(num < 7){
            System.out.println(num);
            num+=2;
        }

        int oddNum = 10;
        int result = 0;
        do{
            if(oddNum % 2 != 0)
                result = result + oddNum;
                oddNum++;

        }while(oddNum <= 20);
            System.out.println("Сумма нечетных чисел: " + result);
    }
}