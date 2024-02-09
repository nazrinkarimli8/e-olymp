package org.example.pre_module00_exam_mixed;

import java.util.Scanner;

public class RatioOfMultiplicationToSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double product = 1;
        int sum = 0;
        int number = n;
        while (number > 0) {
            int digit = number % 10;
            product *= digit;
            sum += digit;
            number = number / 10;
        }

        System.out.printf("%.3f", (product / sum));
    }
}