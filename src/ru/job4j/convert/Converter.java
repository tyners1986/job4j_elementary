package ru.job4j.convert;

public class Converter {

    public static int euroToRub(int value) {
        int euro = value * 70;
        return euro;
    }

    public static int dollarToRub(int value) {
        int dollar = value * 60;
        return dollar;
    }

    public static void main(String[] args) {
        int in = 2;
        int expected = 140;
        int out = Converter.euroToRub(in);
        boolean passed = expected == out;
        System.out.println("2 euro 140 rubles Test result : " + passed);
        int inn = 2;
        int expectedd = 120;
        int outt = Converter.dollarToRub(inn);
        boolean passedd = expectedd == outt;
        System.out.println("2 dollars 120 rubles Test result : " + passedd);
    }
}
