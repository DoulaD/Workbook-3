package com.pluralsight;

import java.util.ArrayList;
import java.util.List;

public class InventoryApplication {
    public static void main(String[] args) {
        getInventory();

    }

    public static List<String> getInventory() {
        List<String> items = new ArrayList<String>();

                items.add("Socks");
                items.add("Shoes");
                items.add("Shirt");
                items.add("Hat");
                items.add("Pants");
        System.out.println(items);
        return items;



    }
}


