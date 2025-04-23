package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class App {
    public static void main(String[] args) {


        try {
            FileReader fileReader = new FileReader("src/data/employees.csv");
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String input;
            while ((input = bufferedReader.readLine()) != null) {
                System.out.println(input);

            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
