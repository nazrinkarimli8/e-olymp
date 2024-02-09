package org.example.pre_module00_exam_mixed;

import java.util.Scanner;

public class CalculationOfSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double sum = 0;
        for (float i = 1; i <= n; i++) {
            sum += 1 / (i * (i + 1));
        }
        System.out.printf("%.6f", sum);
    }
}
