package ru.job4j.condition;

public class Point {

    public static double distance(int x1, int y1, int x2, int y2) {
          int lX = x2 - x1;
          int lY = y2 - y1;
          int lPowX = (int) Math.pow(lX, 2);
          int lPowY = (int) Math.pow(lY, 2);
          double result = Math.sqrt(lPowX + lPowY);
          return result;
            }

    public static void main(String[] args) {
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double result = Point.distance(x1, y1, x2, y2);

        System.out.println("result (" + x1 + "," + y1 + ") to (" + x2 + "," + y2 + ") = " + result);
    }
}