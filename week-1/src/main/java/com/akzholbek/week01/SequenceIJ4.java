package com.akzholbek.week01;

public class SequenceIJ4 {
    public static void main(String[] args) {
        for (double i = 0; i <= 2; i += 0.2) {
            for (int j = 1; j <= 3; j++) {
                double adjustedJ = j + i;

                // Handle precision issues for floating point numbers
                System.out.printf("I=%s J=%s\n", formatNumber(i), formatNumber(adjustedJ));
            }
        }
    }

    private static String formatNumber(double number) {
        // Check if the number is effectively an integer
        if (number == (int) number) {
            return String.format("%d", (int) number);
        } else {
            return String.format("%.1f", number);
        }
    }

}
