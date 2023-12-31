package com.akzholbek.week01;

import java.util.Scanner;

public class WeightedAverages {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of test cases
        int N = scanner.nextInt();

        for (int i = 0; i < N; i++) {
            // Read the three numbers
            double num1 = scanner.nextDouble();
            double num2 = scanner.nextDouble();
            double num3 = scanner.nextDouble();

            // Calculate the weighted average
            double weightedAverage = (num1 * 2 + num2 * 3 + num3 * 5) / 10.0;

            // Print the result
            System.out.printf("%.1f\n", weightedAverage);
        }

        scanner.close();
    }
}
