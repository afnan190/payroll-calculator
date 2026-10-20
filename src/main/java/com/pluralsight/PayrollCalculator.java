package com.pluralsight;

import java.util.Scanner;

public class PayrollCalculator {
    static Scanner myScanner = new Scanner(System.in);

    public static void main(String[] args) {
        String name = getName();
        double hoursWorked = getHoursWorked();
        double payRate = getPayRate();

        double grossPay = calculateGrossPay(hoursWorked, payRate);

        displayPay(name, grossPay);
    }

    public static String getName() {
        System.out.print("Enter your name: ");
        return myScanner.nextLine();
    }

    public static double getHoursWorked() {
        System.out.print("Enter number of hours worked: ");
        return myScanner.nextDouble();
    }

    public static double getPayRate() {
        System.out.print("Enter rate of pay: ");
        return myScanner.nextDouble();
    }
    public static double calculateGrossPay(double hours, double rate) {
        return hours * rate;
    }

    public static void displayPay(String name, double grossPay) {
        System.out.printf("Employee: %s Gross Pay: $%.2f%n", name, grossPay);

    }
}

