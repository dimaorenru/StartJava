package com.startjava.Lesson_1.variable;

public class Variable {

    public static void main(String[] args) {
        byte cpu = 1 + 3;
        System.out.println(cpu);

        short ram = 16;
        System.out.println(ram);

        int ssd = 1024;
        System.out.println(ssd);

        long hdd = 1024;
        System.out.println(hdd);

        float ghz = 3.4f;
        System.out.println(ghz);

        double dimm = 1.333;
        System.out.println(dimm);

        char intel = 'i';
        System.out.println(intel);

        int gpu = 4;
        int ddr = 3;
        boolean ddr3 = gpu > ddr;
        System.out.println(ddr3);
    }
}