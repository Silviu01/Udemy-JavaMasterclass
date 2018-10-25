package com.Silviu;

public class Main {

    public static void main(String[] args) {
	// write your code here

        //width of 16 (has 2 bytes)
        char myChar = '\u00A9'; //unicode character
        System.out.println("Unicode output is: " + myChar);

        boolean myBoolean = false;
        boolean isMale = true;

        char newChar = '\u00AE';
        System.out.println("Unicode char is: " + newChar);
    }
}
