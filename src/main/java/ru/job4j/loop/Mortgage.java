package ru.job4j.loop;

public class Mortgage {
    public static int year(double amount, int salary, double percent) {
        int year = 1;
        amount = amount + amount / 100 * percent;
        while ((amount - salary) >= 0) {
            year += 1;
            amount = amount + (amount / 100 * percent) - salary;
        }
            return year;

    }
}
