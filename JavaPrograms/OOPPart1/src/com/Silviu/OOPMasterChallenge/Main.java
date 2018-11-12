package com.Silviu.OOPMasterChallenge;

public class Main {
    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger("Basic", "white", "sausage", 3.56);
//        double price = hamburger.customizeHamburger();

        hamburger.addHamburgerAddition1("tomato", 0.25);
        hamburger.addHamburgerAddition2("onion", 0.4);
        hamburger.addHamburgerAddition3("cucumber", 0.3);
        hamburger.addHamburgerAddition4("corn", 0.2);
        double price2 = hamburger.customizeHamburger();
        System.out.println("total is " + price2);

        HealthyBurger healthyBurger = new HealthyBurger("bacon", 2.5);
        healthyBurger.addHealthAddition1("tomato", 0.25);
        healthyBurger.addHamburgerAddition1("corn", 0.2);
        System.out.println("total is " + healthyBurger.customizeHamburger());

        DeluxeBurger deluxeBurger = new DeluxeBurger();
        deluxeBurger.addHamburgerAddition1("eggs", 0.3);
        deluxeBurger.customizeHamburger();

    }
}
