package org.example.hw3_arrays;

import java.util.Scanner;

public class ProductOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (number >= 100 && number < 1000) {
            int firstDigit = number / 100;
            int secondDigit = (number / 10) % 10;
            int thirdDigit = number % 10;
            System.out.println(firstDigit * secondDigit * thirdDigit);
        }
    }
}
