
public class ConditionalStatement {

    public static void main (String [] args) {
        int age = 32;
        if(age > 20) {
            System.out.println("Да, верно");
        }

        boolean maleGender = true;
        if(maleGender) {
            System.out.println("Да, верно");
        }

        if(!maleGender) {
            System.out.println("Нет, не верно");
        }

        float manHeight = 1.88f;
        if(manHeight < 1.80) {
            System.out.println("Да, верно");
        } else {
            System.out.println("Нет, не верно");
        }
        
        char firstLetterName = 'D';
        if(firstLetterName == 'M') {
            System.out.println("Нет, не верно");
        } else if(firstLetterName == 'I' || firstLetterName != 'D') {
            System.out.println("Нет, не верно");
        } else {
            System.out.println("Да, верно");
        }
    }
}