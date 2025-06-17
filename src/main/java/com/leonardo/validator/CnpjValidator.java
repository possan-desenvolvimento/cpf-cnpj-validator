package com.leonardo.validator;

public class CnpjValidator {
    public static boolean isValid(String cnpj) {
        if (cnpj == null || !cnpj.matches("\\d{14}")) return false;

        int[] weights1 = {5, 4, 3, 2, 9, 8, 7, 6, 5, 4, 3, 2};
        int[] weights2 = {6, 5, 4, 3, 2, 9, 8, 7, 6, 5, 4, 3, 2};
        int[] digits = cnpj.chars().map(c -> c - '0').toArray();

        int d1 = 0;
        for (int i = 0; i < 12; i++) {
            d1 += digits[i] * weights1[i];
        }
        d1 = 11 - (d1 % 11);
        if (d1 >= 10) d1 = 0;

        int d2 = 0;
        for (int i = 0; i < 13; i++) {
            d2 += digits[i] * weights2[i];
        }
        d2 = 11 - (d2 % 11);
        if (d2 >= 10) d2 = 0;

        return d1 == digits[12] && d2 == digits[13];
    }
}
