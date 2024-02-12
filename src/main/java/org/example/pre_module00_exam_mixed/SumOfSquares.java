package org.example.pre_module00_exam_mixed;

import java.util.Scanner;

public class SumOfSquares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long sum = 0;
        if (n >= 1) {
            for (int i = 1; i < n + 1; i++) {
                sum += (long) i * i;
            }
            System.out.println(sum);
        }
    }
}