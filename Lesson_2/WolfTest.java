public class WolfTest {

    public static void main(String[] args) {
        Wolf wolf = new Wolf();
        wolf.age = 4;
        wolf.nickName = "Balto";
        wolf.color = "grey";
        wolf.gender = "male";
        wolf.weight = 45;

        System.out.println("nickName = " + wolf.nickName);
        System.out.println("age = " + wolf.age);
        System.out.println("color = " + wolf.color);
        System.out.println("gender = " + wolf.gender);
        System.out.println("weight = " + wolf.weight);

        wolf.howl();
        wolf.hunt();
        wolf.sit();
        wolf.run();
    }
}