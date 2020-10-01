package ru.job4j.converter;

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
        int euro = Converter.euroToRub(2);
        System.out.println("1 euro " + euro + " rub.");
        int dollar = Converter.dollarToRub(2);
        System.out.println("1 dollar " + dollar + " rub.");
    }

}
