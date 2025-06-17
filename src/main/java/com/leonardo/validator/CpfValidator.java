package com.leonardo.validator;

public class CpfValidator {
    public static boolean isValid(String cpf) {
        if (cpf == null || !cpf.matches("\\d{11}")) return false;
        if (cpf.chars().distinct().count() == 1) return false;

        int[] digits = cpf.chars().map(c -> c - '0').toArray();

        int d1 = 0;
        for (int i = 0; i < 9; i++) {
            d1 += digits[i] * (10 - i);
        }
        d1 = 11 - (d1 % 11);
        if (d1 >= 10) d1 = 0;

        int d2 = 0;
        for (int i = 0; i < 10; i++) {
            d2 += digits[i] * (11 - i);
        }
        d2 = 11 - (d2 % 11);
        if (d2 >= 10) d2 = 0;

        return d1 == digits[9] && d2 == digits[10];
    }
}
