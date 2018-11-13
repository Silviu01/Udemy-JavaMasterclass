package com.Silviu.listAndArrayList;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class GroceryList {

    private ArrayList<String> groceryList = new ArrayList<String>();

    public void addItem(String item){
        groceryList.add(item);
    }
    public void removeItem(int index){
        groceryList.remove(index);
    }

    public void printList(){

        for(int i = 0; i<groceryList.size(); i++){
            System.out.println(groceryList.get(i));
        }
    }

    public void modifyItem(int index, String newItem){
        groceryList.set(index, newItem);
    }

    public int findItem(String item){
        boolean exists = groceryList.contains(item);
        if(exists){
            return groceryList.indexOf(item);
        }
        return -1;
    }
}
