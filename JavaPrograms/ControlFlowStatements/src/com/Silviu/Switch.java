package com.Silviu;

public class Switch {

    public static void main(String[] args) {
        // write your code here
        int switchValue = 4;
        char c = 'A';

        switch (switchValue) {
            case 1:
                System.out.println("value is 1");
                break;

            case 2:
                System.out.println("value is 2");
                break;

            case 3: case 4: case 5:
                System.out.println("was 3 or 4 or 5");
                System.out.println("Actually it was " + switchValue);
                break;

            default:
                System.out.println("Was not 1 or 2");
                break;
        }

        switch (c) {
            case 'A':
                System.out.println("value is A");
                break;

            case 'B':
                System.out.println("value is B");
                break;

            case 'C':
                System.out.println("was C");
                break;

            default:
                System.out.println("Was not any of the base values");
                break;
        }
    }
}
