package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {

        return left > right ? left : right;
    }

    public static int max(int first, int second, int third) {

        return max(first, max(second, third));

    }

    public static int max(int first, int second, int third, int four) {

        return max(first, max(second, third, four));
   }

    public static void main(String[] args) {
        int rsls = Max.max(5, 30, 10, 50);
        int rsl = Max.max(10, 15, 20);
        int rez = Max.max(15, 45);
        System.out.println(rsls);
        System.out.println(rsl);
        System.out.println(rez);

    }
}
