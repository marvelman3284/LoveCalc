package LoveCalc;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class Love {

    private static String name1;
    private static String name2;

    private static double lovePercent;
    private static int LovePercent;
    private static int divoracePercent;
    private static String WhoDivoraced;
    private static int kids;

    public static void Main() {
        LoveCalc();
        oneNight();
        marriage();
        Date();
    }
    public static void LoveCalc() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nWhat is the first persons name: ");

        name1 = sc.nextLine();
        System.out.println("What is the second persons name: ");

        name2 = sc.nextLine();

        lovePercent = Math.random() * 100;

        LovePercent = (int) (Math.floor(lovePercent) + 15.0);

        System.out.println("\n" + name1 + " has a " + LovePercent + "% chance of falling in love with " + name2);
    }

    public static void marriage() {
        if (LovePercent >= 80) {
            double marriedPercent = Math.random() * 100;

            int MarriedPercent = (int) Math.floor(marriedPercent);

            System.out.println("\n" + name1 + " has a " + MarriedPercent + "% chance of getting married to " + name2);

            marriageStatus();
            reMarriage();
            kidStatus();
        }
    }

    public static void kidStatus() {
        List<Integer> genderStatus = Arrays.asList(1, 2);
        List<Integer> kidAmt = Arrays.asList(1, 2, 3, 4, 5);
        Random rand = new Random();
        int genders = genderStatus.get(rand.nextInt(genderStatus.size()));
        int kidAmts = kidAmt.get(rand.nextInt(kidAmt.size()));
        int boys = 0;
        int girls = 0;
        for (int i = 0; i < kidAmts; i++) {
            String gender;
            if (genders == 0) {
                boys+=1;
            } else {
                girls+=1;
            }
        }
        System.out.println("You will have " + boys + " boys and " + girls + " girls.");
    }

    public static void marriageStatus() {
        int minYears = 1;
        int maxYears = 100;
        int minMonths = 1;
        int maxMonths = 12;
        int minDays = 1;
        int maxDays = 31;

        int marriageYears = ThreadLocalRandom.current().nextInt(minYears, maxYears + 1);
        int marriageMonths = ThreadLocalRandom.current().nextInt(minMonths, maxMonths + 1);
        int marriageDays = ThreadLocalRandom.current().nextInt(minDays, maxDays + 1);

        if (marriageYears >= 85) {
            System.out.println("\n" + name1 + " and " + name2 + " marriage will last till death!");
        } else {
            divoracePercent = (int) Math.floor(Math.random() * 100);
            if (divoracePercent > 75) {
                List<Integer> names = Arrays.asList(1, 2);
                Random rand = new Random();
                int whoDivoraced = names.get(rand.nextInt(names.size()));
                if (whoDivoraced == 1) {
                    WhoDivoraced = name1;
                } else {
                    WhoDivoraced = name2;
                }
                System.out.println("\n" + name1 + " and " + name2 + " marriage will last for " + marriageYears + " years, " + marriageMonths + " months, and " + marriageDays + " days. The chance of a divorce is " + divoracePercent + "%. It will be " + WhoDivoraced + " who divorces.");
            }
        }
    }

    public static void reMarriage() {
        if (divoracePercent > 75) {
            int reMarryPercent = (int) Math.floor(Math.random() * 100);

            if (reMarryPercent >= 80) {
                int minYearsReMarry = 0;
                int maxYearsReMarry = 7;

                int minMonthsReMarry = 1;
                int maxMonthsReMarry = 12;

                int minDaysReMarry = 1;
                int maxDaysDateReMarry = 31;

                int reMarryYears = ThreadLocalRandom.current().nextInt(minYearsReMarry, maxYearsReMarry + 1);
                int reMarryMonth = ThreadLocalRandom.current().nextInt(minMonthsReMarry, maxMonthsReMarry + 1);
                int reMarryDays = ThreadLocalRandom.current().nextInt(minDaysReMarry, maxDaysDateReMarry + 1);

                System.out.println(WhoDivoraced + " will remarry in " + reMarryYears + " years, " + reMarryMonth + " months, " + reMarryDays + " days.");
            }
        }
    }

    public static void Date() {
        if (LovePercent >= 65) {
            int minMonthsDate = 1;
            int maxMonthsDate = 12;
            int minDaysDate = 1;
            int maxDaysDate = 31;
            int dateMonth = ThreadLocalRandom.current().nextInt(minMonthsDate, maxMonthsDate + 1);
            int dateDays = ThreadLocalRandom.current().nextInt(minDaysDate, maxDaysDate + 1);

            int datePercent = (int) Math.floor(Math.random() * 100);

            System.out.println("\n" + name1 + " will date " + name2 + " for " + dateMonth + " months and " + dateDays + " days.\n");

            if (datePercent >= 70 && lovePercent < 80) {
                int engagedPercent = (int) Math.floor(Math.random() * 100);

                System.out.println("There is a " + engagedPercent + "% chance that " + name1 + " will propose to " + name2 + " and " + name1 + " will break it off.");
            }
        }
    }

    public static void oneNight() {
        if (LovePercent <= 50) {
            int stand = (int) Math.floor(Math.random() * 100);

            System.out.println(name2 + " has a " + stand + "% chance of having a one night stand with " + name1);
        }
    }
}