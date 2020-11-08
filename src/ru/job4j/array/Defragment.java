package ru.job4j.array;

public class Defragment {
    public static String[] compress(String[] array) {
        for (int index = 0; index < array.length; index++) {
            if (array[index] == null) {
                int point = index;
                for (int j = point + 1; j < array.length; j++) {
                    if (array[j] != null) {
                        int target = j;
                        String temp = array[point];
                        array[point] = array[target];
                        array[target] = temp;
                        break;

                    }

                }/* указатель на null ячейку. */
                /* переместить первую не null ячейку. Нужен цикл. */
            }
           // System.out.print(array[index] + " ");
        }
        return array;
    }
}





