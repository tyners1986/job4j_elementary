package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double rslX = x2 - x1;
        double first = Math.pow(rslX, 2);
        double rslY = y2 - y1;
        double second = Math.pow(rslY, 2);
        double sum = first + second;
        double root = Math.sqrt(sum);
        return root;
    }

    public static void main(String[] args) {
        double result = Point.distance(6, 8, 2, 2);
        System.out.println("result (0, 0) to (2, 0) " + result);
    }
}
