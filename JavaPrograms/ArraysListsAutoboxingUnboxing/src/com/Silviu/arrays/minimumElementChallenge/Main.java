package com.Silviu.arrays.minimumElementChallenge;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        int[] newArray = readIntegers(5);
        int minValue = findMin(newArray);
        System.out.println("min value is: " + minValue);


    }

    private static int[] readIntegers(int count) {
        int[] myArray = new int[count];
        System.out.println("insert " + count + " int numbers.\r");
        for(int i = 0; i<myArray.length; i++){
            myArray[i] = scanner.nextInt();
        }
        return myArray;
    }
    private static int findMin(int[] array){
        int min = array[0];
        for (int i = 0; i< array.length; i++){
            if (min > array[i]){
                min = array[i];
            }
        }
        return min;
    }
}
