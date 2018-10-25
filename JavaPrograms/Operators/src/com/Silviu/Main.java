package com.Silviu;

public class Main {

    public static void main(String[] args) {
	// write your code here
        double a = 20d;
        double b = 80d;
        double c = (a+b)*25;
        double remainder = c%40;
        System.out.println("Remainder is: " + remainder);

        if(remainder<=20){
            System.out.println("total waas over the limit");
        }

    }
}
