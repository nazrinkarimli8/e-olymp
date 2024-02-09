package org.example.pre_module00_exam_mixed;

import java.util.Scanner;

public class SumOfOddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int sum = 0;
            for (int j = 1; j <= n; j += 2) {
                sum += j;
            }
            System.out.println(sum);
        }
    }
}