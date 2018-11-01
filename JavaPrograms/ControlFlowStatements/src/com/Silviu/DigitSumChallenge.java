package com.Silviu;

public class DigitSumChallenge {
    public static void main(String[] args) {
        System.out.println(sumDigits(201));
    }

    public static int sumDigits(int number) {
        int sum = 0;
        if (number >= 10) {
            while (number > 0) {
                int digit = number % 10;
                number /= 10;
                sum += digit;
            }
            return sum;
        } else {
            return -1;
        }
    }
}
