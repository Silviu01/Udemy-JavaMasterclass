package com.Silviu.OOPMasterChallenge;

public class DeluxeBurger extends Hamburger {
    public DeluxeBurger() {
        super("Deluxe", "White", "Sausage and bacon", 12.35);
        super.addHamburgerAddition1("Chips", 2.7);
        super.addHamburgerAddition2("Coke", 3.25);
    }

    @Override
    public void addHamburgerAddition1(String name, double price) {
        System.out.println("cannot add aditional items");
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        System.out.println("cannot add aditional items");
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        System.out.println("cannot add aditional items");
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        System.out.println("cannot add aditional items");
    }
}
