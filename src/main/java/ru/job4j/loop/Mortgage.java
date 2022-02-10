package ru.job4j.loop;

public class Mortgage {
    public static int year(double amount, int salary, double percent) {
        int year = 1;
        double amountPlusPercent = amount + amount / 100 * percent;
        while ((amountPlusPercent - salary) >= 0) {
            year += 1;
            amountPlusPercent = amountPlusPercent + (amountPlusPercent / 100 * percent) - salary;
        }
            return year;

    }
}
