package ru.job4j.array;

public class FindLoop {
    public static int indexOf(int[] data, int el) {
        int rst = -1; /* если элемента нет в массиве, то возвращаем -1. */
        for (int i = 0; i < data.length; i++) { //for-earch можно использовать???

                if (data[i] == el) {
                rst = i;
                break;
            }
        }
        return rst;
    }
}