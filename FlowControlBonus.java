package com.tts;
import java.util.*;


public class FlowControlBonus {


    public static void main(String[] args) {

        ///Print out the multiplication table for 1 to 10

        Scanner in = new Scanner(System.in);
        System.out.println("Input the Number: ");
        int n = in.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println("\t" + n + "*" + i + " = " + (n * i));
        }


        System.out.print("Enter three values to be sorted: ");

        Scanner input = new Scanner(System.in);


        // Sort the numbers

        System.out.println("Enter your first number:");
        int a = input.nextInt();
        System.out.println("Enter your second number:");
        int b = input.nextInt();
        System.out.println("Enter your third number:");
        int c = input.nextInt();

        int l = 0;
        int s = 0;
        int m = 0;
        if ((a > b) && (a > c))
            l = a;
        if ((b > a) && (b > c))
            l = b;
        if ((c > a) && (c > b))
            l = c;
        if ((a < b) && (a < c))
            s = a;
        if ((b < a) && (b < c))
            s = b;
        if ((c < a) && (c < b))
            s = c;
        m = (a + b + c) - (l + s);
        System.out.printf("largest number:%d ", l);
        System.out.printf("smallest number:%d ", s);
        System.out.printf("middle number:%d ", m);
        System.out.printf("The ascending order is %d %d %d ", s, m, l);

///Calculate (german) grades for an examination
        System.out.println("\nEnter Your points here : ");
        Scanner CalculateGrades = new Scanner(System.in);

        double points = CalculateGrades.nextDouble();

        double myGrade = getGrade(points);
        System.out.println("your grade : " + myGrade);


        //Returns the grade for the given points.
//


//Prints out the day of the week for a given day, month, and year.

//
//        Scanner input = new Scanner(System.in);

//        // Prompt the user to enter a year, month, and day of the month.

        System.out.println("Enter year: (e.g., 2012): ");
        int year = input.nextInt();
        System.out.println("Enter month: 1-12: ");
        int month = input.nextInt();
        System.out.println("Enter the day of the month: 1-31: ");
        int dayOfMonth = input.nextInt();
//
//        // Convert January and February to months 13 and 14 of the previous year
        if (month == 1 || month == 2) {
            month = (month == 1) ? 13 : 14;
            year--;
        }

        // Calculate day of the week
        int dayOfWeek = (dayOfMonth + (26 * (month + 1)) / 10 + (year % 100)
                + (year % 100) / 4 + (year / 100) / 4 + 5 * (year / 100)) % 7;
//
//        // Display result
        System.out.print("Day of the week is ");
        switch (dayOfWeek) {
            case 0:
                System.out.println("Saturday");
                break;
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
        }

        ////Winning strategy for Roulette

        System.out.println("Do you know how much money you approximately need for playing 1 000 000 times with 1 Euro as the first bet");

        long seedCapital = 0;

        for (int round = 0; round < 1000000; round++) {
            long wager = 1;
            while (Math.random() < 0.5) {
                wager *= 2;
            }
            if (wager > seedCapital) {
                seedCapital = wager;
                System.out.println("[" + round + "] Maximum seed capital: " + seedCapital);
            }
        }

        long seedMoney = 1000;
        int round = 0;

        while (seedMoney > 0) {
            long wager = 1;
            while (Math.random() < 0.5) {
                wager *= 2;
            }
            if (wager > seedMoney) {
                seedMoney = 0;
            } else {
                seedMoney++;
            }
            round++;
            System.out.println("You lost all your money after " + round + " rounds.");

        }


        //Convert a given number of bytes into a representation with metric units


        int bytes = 1532300001;
        double bytesMetric = 0;
        String unit = "Byte";

        if (bytes / 1000 == 0) {
            bytesMetric = bytes;
        } else if (bytes / 1000000 == 0) {
            bytesMetric = bytes / 1000.0;
            unit = "KByte";
        } else if (bytes / 1000000000 == 0) {
            bytesMetric = bytes / 1000000.0;
            unit = "MByte";
        } else {
            bytesMetric = bytes / 1000000000.0;
            unit = "GByte";
        }

        System.out.println(bytes + " are " + bytesMetric + " " + unit);
    }


    public static double getGrade(double points) {

        double grade = 5.0;
        if (50.0 <= points && points < 59.9) {
            grade = 4.7;
        } else if (60.0 <= points && points < 64.9) {
            grade = 4.0;
        } else if (65.0 <= points && points < 69.9) {
            grade = 3.7;
        } else if (70.0 <= points && points < 75.9) {
            grade = 3.3;
        } else if (75.0 <= points && points < 79.9) {
            grade = 3.0;
        } else if (80 <= points && points < 84.9) {
            grade = 2.7;
        } else if (85 <= points && points < 89.9) {
            grade = 2.3;
        } else if (90 <= points && points < 94.9) {
            grade = 2.0;
        } else if (95 <= points && points < 99.9) {
            grade = 1.7;
        } else if (100 <= points && points < 104.9) {
            grade = 1.3;
        } else if (105 <= points && points < 120.4) {
            grade = 1.0;
        }
        System.out.println(grade);

        return grade;
    }
}























