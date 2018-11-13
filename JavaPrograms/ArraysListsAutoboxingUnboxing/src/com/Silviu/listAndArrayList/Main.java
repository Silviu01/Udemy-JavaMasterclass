package com.Silviu.listAndArrayList;

public class Main {
    public static void main(String[] args) {
        GroceryList groceryList = new GroceryList();

        groceryList.addItem("eggs");
        groceryList.addItem("tomatoes");
        groceryList.addItem("milk");
        groceryList.addItem("cereals");

        groceryList.printList();
        groceryList.modifyItem(1, "tomatos");
        groceryList.printList();

        System.out.println();
        groceryList.removeItem(3);
        groceryList.printList();

        System.out.println(groceryList.findItem("milk"));

    }
}
