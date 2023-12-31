package com.akzholbek.week01;

import java.util.Scanner;

public class PopulationIncrease {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of test cases
        int T = scanner.nextInt();

        for (int i = 0; i < T; i++) {
            int PA = scanner.nextInt();  // Population of city A
            int PB = scanner.nextInt();  // Population of city B
            double G1 = scanner.nextDouble();  // Growth rate of city A
            double G2 = scanner.nextDouble();  // Growth rate of city B

            int years = 0;

            while (PA <= PB) {
                // Calculate population growth for each year
                PA += (int) (PA * (G1 / 100));
                PB += (int) (PB * (G2 / 100));
                years++;

                // Check if it takes more than a century
                if (years > 100) {
                    System.out.println("Mais de 1 seculo.");
                    break;
                }
            }

            if (years <= 100) {
                System.out.println(years + " anos.");
            }
        }

        scanner.close();
    }

}
