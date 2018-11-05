package com.Silviu;

public class NumberToWords {
    public static void main(String[] args) {
        numberToWords(123);
        numberToWords(1010);
        numberToWords(1000);
        numberToWords(-12);
//        System.out.println(reverse(234));
    }

    public static void numberToWords(int number) {
        if(number<0){
            System.out.println("Invalid Value");
        }else{
            int reversedNumber = reverse(number);
            int reversedNumber1 = reversedNumber;
            while(reversedNumber != 0) {
                int digit = reversedNumber % 10;
                switch (digit) {
                    case 0:
                        System.out.println("Zero");
                        break;
                    case 1:
                        System.out.println("One");
                        break;
                    case 2:
                        System.out.println("Two");
                        break;
                    case 3:
                        System.out.println("Three");
                        break;
                    case 4:
                        System.out.println("Four");
                        break;
                    case 5:
                        System.out.println("Five");
                        break;
                    case 6:
                        System.out.println("Six");
                        break;
                    case 7:
                        System.out.println("Seven");
                        break;
                    case 8:
                        System.out.println("Eight");
                        break;
                    case 9:
                        System.out.println("Nine");
                        break;
                }
                reversedNumber /= 10;
            }
            int digitsNumber = getDigitCount(number);
            int digitsReversedNumber = getDigitCount(reversedNumber1);
            int digits = digitsNumber-digitsReversedNumber;
            for (int i = 1; i<=digits; i++){
                System.out.println("Zero");
            }
            if (number == 0)
                System.out.println("Zero");
        }
    }

    public static int reverse(int number){
        int newNumber = 0;
        while(number != 0){
            int digit = number % 10;
            newNumber = newNumber*10 + digit;
            number /= 10;
        }return newNumber;
    }

    public static int getDigitCount(int number){
        if (number <0){
            return -1;
        }
        if(number==0){
            return 1;
        }else{
            int count =0;
            while(number!=0){
                int digit = number%10;
                count++;
                number/=10;
            }
            return count;
        }
    }
}
