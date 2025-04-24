package com.pluralsight;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> books = new ArrayList<String>();
        books.add("Defining Decade");
        books.add("Contagious");
        books.add("Atomic Habits");


        System.out.println(books.get(0));
        books.remove(2);

        System.out.println(books);
    }
}
