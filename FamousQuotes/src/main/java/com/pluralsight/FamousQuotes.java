package com.pluralsight;

import java.util.Scanner;

public class FamousQuotes {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] famousQuotes = {"The only limit to our realization of tomorrow is our doubts of today. – Franklin D. Roosevelt",
                "In the middle of every difficulty lies opportunity. – Albert Einstein",
                "Success is not final, failure is not fatal: It is the courage to continue that counts. – Winston Churchill",
                "I have not failed. I've just found 10,000 ways that won't work. – Thomas Edison",
                "Do not go where the path may lead, go instead where there is no path and leave a trail. – Ralph Waldo Emerson",
                "You miss 100% of the shots you don’t take. – Wayne Gretzky",
                "What lies behind us and what lies before us are tiny matters compared to what lies within us. – Ralph Waldo Emerson",
                "Believe you can and you're halfway there. – Theodore Roosevelt",
                "Everything you can imagine is real. – Pablo Picasso",
                "The future belongs to those who believe in the beauty of their dreams. – Eleanor Roosevelt"};

        System.out.println("Enter a number between 1 - 10 for a surprise quote");
        int choice = scanner.nextInt();
        try {
            System.out.println("Your quote is: " + famousQuotes[choice - 1]);
        } catch (Exception e) {
            System.out.println("Your number is out of range!");

        }


    }


    }

