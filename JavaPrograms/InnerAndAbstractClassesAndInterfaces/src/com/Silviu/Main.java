package com.Silviu;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ITelephone myPhone;
        myPhone = new DeskPhone(123456);
        myPhone.powerOn();
        myPhone.callPhone(456123);
        myPhone.answer();
    }
}
