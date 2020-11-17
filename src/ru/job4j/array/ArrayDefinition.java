package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        String[] names = new String[4];
        names[0] = "привет";
        names[1] = "пока";
        names[2] = "как дела";
        names[3] = "все доброго";
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        //System.out.println("Размер массива равен: " + suenames.length);
    }

}
