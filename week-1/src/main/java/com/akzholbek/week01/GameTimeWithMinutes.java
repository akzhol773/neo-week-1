package com.akzholbek.week01;

import java.util.Scanner;

public class GameTimeWithMinutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Reading the start and end times
        int startHour = scanner.nextInt();
        int startMinute = scanner.nextInt();
        int endHour = scanner.nextInt();
        int endMinute = scanner.nextInt();

        // Convert start and end times to minutes
        int startTimeInMinutes = startHour * 60 + startMinute;
        int endTimeInMinutes = endHour * 60 + endMinute;

        // Calculate the duration
        int duration = endTimeInMinutes - startTimeInMinutes;

        // If duration is 0 or negative, the game ended on the next day
        if (duration <= 0) {
            duration += 24 * 60; // Add 24 hours
        }

        // Convert duration back to hours and minutes
        int durationHours = duration / 60;
        int durationMinutes = duration % 60;

        // Output the result
        System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n", durationHours, durationMinutes);

        scanner.close();
    }

}
