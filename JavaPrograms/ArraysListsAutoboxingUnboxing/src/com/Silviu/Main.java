package com.Silviu;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int[] myArray;  //standard definition of an array
        myArray = new int[10];  //size of 10 elements
        myArray[5] = 50;    //counting starts at position 0

        int[] myArray2 = {1, 2, 3, 4, 5, 6, 7, 8, 9};   //definition of an array

        double[] myDoubleArray = new double[5];

        System.out.println(myArray2[3]);

        int[] myArray3 = new int[10];
        for (int i = 0; i < 10; i++) {
            myArray3[i] = i * 10;
        }

        printArray(myArray3);

    }

    private static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {    //it is best to use .length
            System.out.println("Element " + i + ", value is " + array[i]);
        }
    }
}
