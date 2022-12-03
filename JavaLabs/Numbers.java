package com.labsies.thebasics;

import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        Numbers labsies = new Numbers();
        labsies.Drivesies();

    }   

    public void Drivesies() {
        multiTable();
        dimSum();

    }

    public void multiTable() {
        int a = 10; // how high the multiplication table will go
        for (int b = 1; b <= a; b++) { // b is the 1st multiplication factor and c is the second
            for (int c = 1; c <= a; c++) {
                System.out.format("%4d", b * c);
            }
            System.out.println();
        }
    }

    public void dimSum() {
        Scanner scannie = new Scanner(System.in);

        // The sum  of all even numbers from 2 to 100 inclusive
        int evenSum = 0;

        for (int b = 0; b < 101; b++) {
            if (b % 2 == 0) {
                evenSum = evenSum + b;
            }
        }
        System.out.println(evenSum);


        // The sum of all squares from 1 to 100 inclusive
        int squareSum = 0;

        for (int i = 0; i < 101; i++) {
            squareSum = squareSum + i * i;
        }
        System.out.println(squareSum);

        // ALl powers of 2 from 0 to 20
        int powerSum = 2;

        while (powerSum < Math.pow(2, 21)) {
            powerSum = powerSum * 2;
            System.out.format("%d ", powerSum);
        }
        System.out.println();

        // The sum of all odd numbers between a and b (inclusive) where a and b are inputs
        System.out.print("Please choose a random number: ");
        int a = scannie.nextInt();

        System.out.print("Please choose another random number greater than the first one: ");
        int b = scannie.nextInt();

        int sum = 0;

        if (a > b) {
            System.out.println("That range does not exist.");
        }

        for (int i = a; i < b + 1; i++) {
            if (i % 2 != 0) {
                sum = sum + i;
            }
        }
        System.out.println(sum);

        //The sum of all odd digits of an input
        System.out.print("Please type in a random number: ");
        int number = scannie.nextInt();
        int ans = 0;
        int digit;

        while (number > 0) {
            digit = number % 10; // we look at the "last" digit
            if (digit % 2 == 1) {
                ans += digit;
            }
            number /= 10;
        }
        System.out.println(ans);
    }
}
