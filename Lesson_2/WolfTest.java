public class WolfTest {

    public static void main(String[] args) {
        Wolf wolf = new Wolf();
        System.out.println("nickName = " + wolf.nickName);
        System.out.println("gender = " + wolf.gender);
        System.out.println("weight = " + wolf.weight);
        System.out.println("color = " + wolf.color);
        System.out.println("age = " + wolf.age);
        wolf.howl();
        wolf.hunt();
    }
}