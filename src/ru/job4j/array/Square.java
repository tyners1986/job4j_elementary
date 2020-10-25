package ru.job4j.array;

public class Square {
    public static int[] calculate(int bound) {
        int[] rst = new int[bound];
        for (int i = 0; i < rst.length; i++) {
            rst[i] = i * i; // метод Math.pow не использовал так как возвращает double
        }
        /* заполнить массив через цикл элементами от 0 до bound , возведенными в квадрат */
        return rst;
    }

    public static void main(String[] args) {
        int[] array = calculate(4);
        for (int on : array) { // переписал на цикл for - earch
            System.out.println(on);

        }
        //for (int index = 0; index < array.length; index++) {
         //   System.out.println(array[index]);
       // }
    }
}