package org.example.hw3_arrays;

import java.util.Scanner;

public class SquareOfSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (number >= 10 && number < 100) {
            int firstDigit = number / 10;
            int secondDigit = number % 10;
            int sum = firstDigit + secondDigit;
            System.out.println(sum*sum);
        }
    }
}
