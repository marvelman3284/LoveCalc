package LoveCalc;

import java.util.Scanner;

public class Main {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";

    public static void main(String[] args) {
	// TODO: Clean up code
    // TODO: FINISH THIS PROJECT RETARD
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println(ANSI_RED + "\nWelcome to the Love Calculator" + ANSI_RESET);
            Love.Main();
            System.out.println("Do you want to enter more names?(yes/no): ");
            String con = sc.nextLine();
            if (!con.equalsIgnoreCase("yes")) break;
        }
    }
}
