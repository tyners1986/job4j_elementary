package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
                int result = left > right ? left : right;
                return result;
    }

    public static int max(int first, int second, int third) {
        int fir = (first > second) ? first : second;
        int sec = (fir > third) ? fir : third;

        return sec;
    }

    public static int max(int first, int second, int third, int four) {
        int fir = (first > second) ? first : second;
        int sec = (fir > third) ? fir : third;
        int fin = (sec > four) ? sec : four;
        return fin;
   }

    public static void main(String[] args) {
        int rsls = Max.max(5, 30, 10, 50);
        int rsl = Max.max(10, 15, 20);
        System.out.println(rsls);
        System.out.println(rsl);

    }
}
