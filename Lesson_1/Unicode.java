public class Unicode {
    //Оба варианта выдают символы и вопросики
    public static void main(String[] args) {
        for (int i = 9398; i <= 10178; i++) {
            System.out.println((char) i);
        }

        for (int i = 33; i <= 126; i++) {
            System.out.println((char) i);
        }
    }
}