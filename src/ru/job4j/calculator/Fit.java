package ru.job4j.calculator;

public class Fit {

    public static double manWeight(short height) {
        double rsl = (height - 100) * 1.15;
        return rsl;
    }

    public static double womanWeight(short height) { // Аргумент переиминовал и наче не проходитрешение.
        double rsl = (height - 110) * 1.15;
        return rsl;
    }

    public static void main(String[] args) {
        short height = 175;
        double man = Fit.manWeight(height);
        System.out.println("Man 175 is "  + man);
        short wHeight = 165;
        double woman = Fit.womanWeight(wHeight);
        System.out.println("Woman 165 is " + woman);
    }

}
