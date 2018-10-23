package com.Silviu;

public class Main {

//    section 3, lecture 17
    public static void main(String[] args) {

//        HOLE NUMBERS

        // int has a width of 32
        int myMinValue = -2_147_483_648;    //in the right, the number is called a literal
        int myMaxValue = 2_147_483_647;
        int myTotal = (myMinValue/2);

        // byte has a width of 8
        byte myByte = 127; //-128
        byte myNewByte = (byte)(myByte/2);

        // short has a width of 16 bits
        short myShort = 32767; //-32768
        short myNewShort = (short) (myShort/2);

        //long has a width of 64, double than int
        long myLongValue = 9_223_372_036_854_775_807L;    //you can store 2 at power 63

        byte newByte = 12;
        short newShort = 25;
        int newInt = 34;
        long newLongValue = 50000L + 10L*(newByte + newShort + newInt);
        short shortTotal = (short)(1000 + 10 * (newByte + newShort + newInt));
        System.out.println(newLongValue);
    }
}
