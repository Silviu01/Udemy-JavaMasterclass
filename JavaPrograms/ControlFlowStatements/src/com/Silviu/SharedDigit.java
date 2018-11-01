package com.Silviu;

public class SharedDigit {
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12, 23));
        System.out.println(hasSharedDigit(9, 99));
        System.out.println(hasSharedDigit(15, 55));
    }

    public static boolean hasSharedDigit(int a, int b) {
        int digit1, digit2, temp = b;

        if ((a >= 10 && a <= 99) && (b >= 10 && b <= 99)) {

            while (a != 0) {
                digit1 = a % 10;
                a = a / 10;
                while (b != 0) {
                    digit2 = b % 10;
                    b = b / 10;
                    if (digit1 == digit2) {
                        return true;
                    }
                }
                b = temp;
            }
            return false;
        } else {
            return false;
        }
    }
}
