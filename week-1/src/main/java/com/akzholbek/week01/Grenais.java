package com.akzholbek.week01;

import java.util.Scanner;

public class Grenais {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalMatches = 0;
        int interWins = 0;
        int gremioWins = 0;
        int draws = 0;
        int response;

        do {
            // Read the number of goals for each team
            int goalsInter = scanner.nextInt();
            int goalsGremio = scanner.nextInt();

            // Update the statistics
            totalMatches++;
            if (goalsInter > goalsGremio) {
                interWins++;
            } else if (goalsGremio > goalsInter) {
                gremioWins++;
            } else {
                draws++;
            }

            // Ask if the user wants to continue
            System.out.println("Novo grenal (1-sim 2-nao)");
            response = scanner.nextInt();
        } while (response == 1);

        // Print the statistics
        System.out.println(totalMatches + " grenais");
        System.out.println("Inter:" + interWins);
        System.out.println("Gremio:" + gremioWins);
        System.out.println("Empates:" + draws);

        // Determine the team with the most victories
        if (interWins > gremioWins) {
            System.out.println("Inter venceu mais");
        } else if (gremioWins > interWins) {
            System.out.println("Gremio venceu mais");
        } else {
            System.out.println("Nao houve vencedor");
        }

        scanner.close();
    }

}
