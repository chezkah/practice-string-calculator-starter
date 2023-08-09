package com.tw;

public class StringCalculator {
    public int add(String string) {
        int sum = 0;
        for (char number: string.toCharArray()) {
            if (Character.isDigit(number)) {
                sum += Character.getNumericValue(number);
            }
        }
        return sum;
    }
}