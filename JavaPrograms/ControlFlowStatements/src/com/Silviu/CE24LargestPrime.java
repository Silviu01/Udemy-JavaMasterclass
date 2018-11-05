package com.Silviu;

public class CE24LargestPrime {
    public static void main(String[] args) {
        System.out.println(getLargestPrime(21));
        System.out.println(getLargestPrime(217));
        System.out.println(getLargestPrime(0));
        System.out.println(getLargestPrime(45));
        System.out.println(getLargestPrime(-1));
    }

    public static int getLargestPrime(int number) {
        if (number > 1) {
            int f = number;
            for (int i = 2; i <= number; i++) {
                if (f % i == 0) {
                    while (f % i == 0) {
                        f = f / i;
                    }
                }
                if (f == 1) {
                    return i;
                }
            }
        }
        return -1;
    }
}
