package com.startjava.Lesson_2_3_4.person;

public class Person {
    
    String name = "Dima";
    String gender = "male";
    float height = 1.88f;
    float weight = 89.5f;
    int age = 31;

    boolean doSport() {
        return true;
    }

    void move() {
        System.out.println("moving");
    }

    void run() {
        System.out.println("to run");
    }

    void box() {
        System.out.println("box");
    }

    boolean learnJava() {
        return true;
    }

    String speak() {
        return "I can speak";
    }
}