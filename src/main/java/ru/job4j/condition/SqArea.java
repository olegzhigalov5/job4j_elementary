package ru.job4j.condition;

public class SqArea {
    public static double square(double p, double k) {
        double rsH = 2 * k + 2;
        rsH = p /  rsH;
        double rsL = rsH * k;
        double rsS = rsL * rsH;
        return rsS;
    }

    public static void main(String[] args) {
        double p = 6;
        double k = 2;
        double result1 = SqArea.square(p, k);
        System.out.println(" p = " + p + ",k = " + k + ", s = " + result1);
    }
}
