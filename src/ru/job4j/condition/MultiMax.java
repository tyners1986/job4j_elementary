package ru.job4j.condition;

public class MultiMax {
    public static int max(int first, int second, int third) {
        int fir = (first > second) ? first : second;
        int sec = (fir > third) ? fir : third;

        return sec;
    }
}