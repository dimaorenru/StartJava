package com.startjava.Lesson_2_3_4.animal;

public class WolfTest {

    public static void main(String[] args) {
        Wolf wolf = new Wolf();
        wolf.setAge(4);
        wolf.setNickName("Balto");
        wolf.setColor("grey");
        wolf.setGender("male");
        wolf.setWeight(45);

        System.out.println("Age: " + wolf.getAge());
        System.out.println("Color: " + wolf.getColor());
        System.out.println("Gender: " + wolf.getGender());
        System.out.println("Weight: " + wolf.getWeight());
        System.out.println("NickName: " + wolf.getNickName());

        wolf.howl();
        wolf.hunt();
        wolf.sit();
        wolf.run();
    }
}