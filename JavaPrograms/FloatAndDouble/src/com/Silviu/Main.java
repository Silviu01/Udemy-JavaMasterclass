package com.Silviu;

public class Main {

//    floating point numbers - float and double data types; double is twice data than float

    public static void main(String[] args) {
	// write your code here

//        width of int = 32 (4 bytes)
        int myIntValue = 5/3;
        //        width of float = 32 (4 bytes)
        float myFloatValue = 5f/3f;
        //        width of double = 64 (8 bytes)
        double myDoubleValue = 5d/3d; //using double is recomended because has more decimal points

        System.out.println("my int value = " + myIntValue);
        System.out.println("my float value = " + myFloatValue);
        System.out.println("my double value = " + myDoubleValue);

        double pounds = 200d;
        double kilogram = pounds/2.20462d;
        System.out.println("kilograms = " + kilogram);
    }
}
