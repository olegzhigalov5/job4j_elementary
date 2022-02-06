package ru.job4j.condition;

public class DivideBySix {
    @SuppressWarnings("checkstyle:OperatorWrap")
    public static String checkNumber(int number) {
        String rsl = "";
       if (number % 3 == 0 && number % 2 == 0) {
            rsl = "Исходное число делится на 6.";
        } else {
            rsl = number % 2 == 0 ?
                    "Исходное число не делится на 3, но является четным." :
                    number % 3 == 0 ?
                            "Исходное число делится на 3, но не является четным." :
                            "Исходное число не делится на 3 и не является четным." ;
                    }
       return rsl;
    }
}

