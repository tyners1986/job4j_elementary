

package ru.job4j.loop;

public class Mortgage {
    public static int year(int amount, int salary, double percent) {
        int year = 0;
        while (0 <= amount) {
            amount += amount * percent / 100;
            amount -= salary;
            year++;
        }
        return year;
    }
}
