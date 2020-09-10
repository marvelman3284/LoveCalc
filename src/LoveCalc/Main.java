package LoveCalc;

import java.math.*;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";

    public static void main(String[] args) {
	// TODO: Clean up code
    // TODO: Add a colored heading - DONE
        for (int i = 0; i < 100; i++){
            System.out.println(ANSI_RED + "\nWelcome to the Love Calculator" + ANSI_RESET);
            Love();
        }
    }

    public static void Love() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nWhat is the first persons name: ");

        String name1 = sc.nextLine();
        System.out.println("What is the second persons name: ");

        String name2 = sc.nextLine();

         double lovePercent = Math.random() * 100;

         int LovePercent = (int) Math.floor(lovePercent);

        System.out.println("\n" + name1 + " has a " + LovePercent + "% chance of falling in love with " + name2);

        if (LovePercent >= 80) {
            double marriedPercent = Math.random() * 100;

            int MarriedPercent = (int) Math.floor(marriedPercent);

            System.out.println(name1 + " has a " + MarriedPercent + "% chance of getting married to " + name2);
        }
        if (LovePercent >= 65) {
            int minMonths = 1;
            int maxMonths = 12;
            int minDays = 1;
            int maxDays = 31;
            int dateMonth = ThreadLocalRandom.current().nextInt(minMonths, maxMonths + 1);
            int dateDays = ThreadLocalRandom.current().nextInt(minDays, maxDays + 1);

            System.out.println(name1 + " will date " + name2 + " for " + dateMonth + " months and " + dateDays + " days.\n");
        }
    }
}
