package ru.job4j.condition;

public class Psevdokod {
    public static int pse(int a, int b, int c) {
        System.out.println("Будет выведенна максимальное значение.");
        if (a > b) {
            if (a > c) {
                System.out.println("А максимум");
                return a;
            } else {
                System.out.println("C максимум");
                return c;
            }
        } else {
            if (b > c) {
                System.out.println("B максимум");
                return b;
            } else {
                System.out.println("C максимум");
                return c;
            }
        }
    }

    public static void main(String[] args) {
        Psevdokod.pse(5, 8, 12);

    }
}