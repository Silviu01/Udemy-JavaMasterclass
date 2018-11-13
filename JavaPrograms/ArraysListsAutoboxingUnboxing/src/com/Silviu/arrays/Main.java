package com.Silviu.arrays;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myIntegers = getIntegers(5);
        for(int i = 0; i<myIntegers.length; i++){
            System.out.println(" Element " + i + " typed was: " + myIntegers[i]);
        }
        System.out.println("Average is " + getAverage(myIntegers));
    }

    private static int[] getIntegers(int i) {
        System.out.println("Enter " + i + " integer values.\r");
        int[] values = new int[i];

        for(int j = 0; j <values.length; j++){
            values[j] = scanner.nextInt();
        }
        return values;
    }

    public static double getAverage(int[] array){
        int sum = 0;
        for (int i = 0; i < array.length; i++){
            sum += array[i];
            }
            return (double)sum/array.length;
    }
}
