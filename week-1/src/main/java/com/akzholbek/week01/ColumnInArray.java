package com.akzholbek.week01;

import java.util.Scanner;

public class ColumnInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the column number and the operation type
        int C = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character
        char T = scanner.nextLine().charAt(0);

        // Initialize and read the array elements
        double[][] M = new double[12][12];
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                M[i][j] = scanner.nextDouble();
            }
        }

        // Calculate the sum or average of the "green area"
        double sum = 0;
        int count = 0;
        for (int i = 0; i < 12; i++) {
            if (i < C && i + C < 11) {
                sum += M[i][C];
                count++;
            } else if (i > C && i + C > 11) {
                sum += M[i][C];
                count++;
            }
        }

        // Output the result
        if (T == 'S') {
            System.out.printf("%.1f\n", sum);
        } else if (T == 'M') {
            double average = sum / count;
            System.out.printf("%.1f\n", average);
        }

        scanner.close();
    }

}
