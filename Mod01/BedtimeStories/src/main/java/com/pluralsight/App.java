package com.pluralsight;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("src/data/goldilocks.txt");
            Scanner scanner = new Scanner(fis);

            String line;
            while (scanner.hasNextLine()) {
                line = scanner.nextLine();
                System.out.println(line);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }




    }
}