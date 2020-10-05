package ru.job4j.condition;

public class SqArea {
    public static double square(int p, int k) {
        double height = p / (2 * (k + 1));
        double leng = height * k;
        double area = leng * height;
        return area;
    }

    public static void main(String[] args) {
        double result1 = SqArea.square(30, 12);
        System.out.println(" p = 4, k = 1, s = 1, real = " + result1);
    }
}
