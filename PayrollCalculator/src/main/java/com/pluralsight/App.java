package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class App {
    public static void main(String[] args) {


        try {
            FileReader fileReader = new FileReader("src/data/employees.csv");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            bufferedReader.readLine();

            String input;
            while ((input = bufferedReader.readLine()) != null) {
                String[] tokens = input.trim().split("\\|");
                int id = Integer.parseInt(tokens[0]);
                     String name = tokens[1];
                double hoursWorked = Double.parseDouble(tokens[2]);
                double payRate = Double.parseDouble(tokens[3]);
                Employee employee = new Employee(id,name,hoursWorked,payRate);
                System.out.printf("ID: %d | Name: %-15s | Gross pay $%.2f%n",
                        employee.getEmployeeID(),
                        employee.getName(),
                        employee.getGrossPay());
            }
        } catch (IOException e) {
            System.out.println("Error read in file");
            throw new RuntimeException(e);
        }


    }
}
