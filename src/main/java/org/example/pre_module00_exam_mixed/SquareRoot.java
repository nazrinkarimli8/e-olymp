package org.example.pre_module00_exam_mixed;

import java.util.Scanner;

public class SquareRoot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        if (n >= 1) {
            System.out.printf("%.6f", Math.sqrt(n));
        }
    }
}
