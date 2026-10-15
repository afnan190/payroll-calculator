package com.pluralsight;

import java.util.Scanner;

public class payrollCalculator {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String userName = myScanner.next();

        System.out.println("Enter Number of hours worked: ");
        double hoursWorked = myScanner.nextDouble();

        System.out.println("Enter Rate of Pay: ");
        double payRate = myScanner.nextDouble();

        System.out.println("Employee Stats: " + userName + " Gross Pay: " + hoursWorked * payRate);





    }
}
