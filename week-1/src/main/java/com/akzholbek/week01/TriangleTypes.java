package com.akzholbek.week01;

import java.util.Arrays;
import java.util.Scanner;

public class TriangleTypes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the sides of the triangle
        double[] sides = new double[3];
        System.out.print("Enter sides A, B, and C: ");
        for (int i = 0; i < 3; i++) {
            sides[i] = scanner.nextDouble();
        }

        // Sort the sides in descending order
        Arrays.sort(sides);
        double A = sides[2];
        double B = sides[1];
        double C = sides[0];

        // Check for triangle formation
        if (A >= (B + C)) {
            System.out.println("NAO FORMA TRIANGULO");
        } else {
            // Check for types of triangles
            if (A * A == B * B + C * C) {
                System.out.println("TRIANGULO RETANGULO");
            }
            if (A * A > B * B + C * C) {
                System.out.println("TRIANGULO OBTUSANGULO");
            }
            if (A * A < B * B + C * C) {
                System.out.println("TRIANGULO ACUTANGULO");
            }
            if (A == B && B == C) {
                System.out.println("TRIANGULO EQUILATERO");
            } else if (A == B || B == C || A == C) {
                System.out.println("TRIANGULO ISOSCELES");
            }
        }

        scanner.close();
    }
}
