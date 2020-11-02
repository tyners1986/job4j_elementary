package ru.job4j.array;

public class SkipNegative {
    public static int[][] skip(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                int first = array[i][j];
                if (first < 0) {
                    array[i][j] = 0;
                }

            }

        }
        return array;
    }
}