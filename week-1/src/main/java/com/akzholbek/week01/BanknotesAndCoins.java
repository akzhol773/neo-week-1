package com.akzholbek.week01;

import java.util.Scanner;

public class BanknotesAndCoins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask for the monetary value
        System.out.print("Enter the monetary value (use a comma for decimal places): ");
        double value = scanner.nextDouble();

        // Define arrays for notes and coins
        int[] notes = {100, 50, 20, 10, 5, 2};
        double[] coins = {1, 0.50, 0.25, 0.10, 0.05, 0.01};

        // Convert the value to cents to avoid floating point issues
        int amount = (int) Math.round(value * 100);

        // Calculate the number of notes
        System.out.println("NOTAS:");
        for (int note : notes) {
            int noteValue = note * 100; // Convert note value to cents
            int count = amount / noteValue;
            amount %= noteValue;
            System.out.printf("%d nota(s) de R$ %d.00\n", count, note);
        }

        // Calculate the number of coins
        System.out.println("MOEDAS:");
        for (double coin : coins) {
            int coinValue = (int) Math.round(coin * 100); // Convert coin value to cents
            int count = amount / coinValue;
            amount %= coinValue;
            System.out.printf("%d moeda(s) de R$ %.2f\n", count, coin);
        }

        scanner.close();
    }
}
