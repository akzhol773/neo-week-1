package com.akzholbek.week01;
import java.util.Scanner;


public class Banknotes {
    public static void main(String[] args) {
        //create a Scanner object to get an amount from the user
        Scanner scanner = new Scanner(System.in);

        //prompt the user to enter an amount
        System.out.println("Enter the amount: ");
        int amount = scanner.nextInt();

        //array of banknotes
        int[] notes = {100, 50, 20, 10, 5, 2, 1};

        //print the amount
        System.out.println(amount);

        //loop through each banknote
        for(int note: notes){
            //calculate the number of current banknotes in the decomposition
            int count = amount / note;

            //update the amount with the remaining value
            amount %= note;

            //print the number of banknotes
            System.out.printf("%d nota(s) de R$ %d,00\n", count, note);
        }
        //close the scanner
        scanner.close();
    }
}
