package ru.job4j.array;

public class EqLast {
    public static boolean check(int[] left, int[] right) {
       boolean temp = false;
       int ind = left.length - 1;
       int rights = right.length - 1;
        if (left[ind] == right[rights]){

            temp = true;

        }
        return temp;
    }
}