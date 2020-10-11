package ru.job4j.condition;

public class MultiMax {
    public static int max(int first, int second, int third) {
        if (first > second) {
            if (first > third) {
                System.out.println("first максимум");
                return first;
            } else {
                System.out.println("third максимум");
                return third;
            }
        } else {
            if (second > third) {
                System.out.println("second максимум");
                return second;
            } else {
                System.out.println("third максимум");
                return third;
            }
        }
    }
}