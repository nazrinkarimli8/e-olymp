package org.example.pre_module00_exam_mixed;

import java.util.Scanner;

public class MaxOfAbsoluteValues {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[] numbers = new double[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextDouble();
        }
        double max = numbers[0];
        for (int i = 0; i < n; i++) {
            if (Math.abs(numbers[i]) > max) {
                max = Math.abs(numbers[i]);
            }
        }
        System.out.printf("%.2f", max);
    }
}