package org.example.pre_module00_exam_mixed;

import java.util.Scanner;

public class PositiveNegativeZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        if (n == 0) {
            System.out.println("Zero");
        } else if (n > 0) {
            System.out.println("Positive");
        } else {
            System.out.println("Negative");
        }
    }
}
