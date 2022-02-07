package ru.job4j.condition;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public class DivideBySix {
        @Contract(pure = true)
        public static @NotNull String checkNumber(int number) {
            String rsl;
            if (number % 3 == 0 && number % 2 == 0) {
                rsl = "Исходное число делится на 6.";
                return rsl;
        }
         if (number % 2 == 0) {
            rsl = "Исходное число не делится на 3, но является четным.";
            return rsl;
         }
         if (number % 3 == 0) {
            rsl = "Исходное число делится на 3, но не является четным.";
            return rsl;
         }
        rsl = "Исходное число не делится на 3 и не является четным.";
         return rsl;
    }
}

