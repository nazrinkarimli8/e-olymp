package org.example.pre_module00_exam_mixed;

import java.util.Scanner;

public class PowerOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int n = sc.nextInt();
        if (a > 0 && n > 0) {
            System.out.printf("%.0f", Math.pow(a, n));
        }
    }
}
