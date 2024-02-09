package org.example.pre_module00_exam_mixed;

import java.util.Scanner;

public class SqrtApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int firstDigit = n / 100;
        int secondDigit = (n / 10) % 10;
        int lastDigit = n % 10;
        int sum = firstDigit + secondDigit + lastDigit;
        System.out.printf("%.3f", Math.sqrt(sum));
    }
}