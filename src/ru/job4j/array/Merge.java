package ru.job4j.array;

public class Merge {
    public static int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int i = 0;
        int j = 0;
        int z = 0;
        while (i < left.length) {
            rsl[z] = left[i];
            z++;
            i++;
        }
        while (j < right.length) {
            rsl[z] = right[j];
            z++;
            j++;

        }


        return rsl;

    }
}