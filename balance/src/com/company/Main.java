package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the month amount of the clamping: ");
        double monthlySavingsAmount = input.nextDouble();

        System.out.println("Enter the number of months after which  "
                + "you would like to know your account balance: ");
        int numberOfMonths = input.nextInt();
        final double MONTHLYINTERESTRATE = (1 + 0.00417);

        double finalAccountBalance;
        double sum = 0;
        for (int i = 1; i <= numberOfMonths ; i++) {
            sum += Math.pow(MONTHLYINTERESTRATE, i);
        }
        finalAccountBalance = monthlySavingsAmount * sum;

        System.out.println("Balance in your account after  " + numberOfMonths
                + " months amounts : " + finalAccountBalance);
        input.close();

    }

}

