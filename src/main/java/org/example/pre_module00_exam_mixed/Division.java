package org.example.pre_module00_exam_mixed;

import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a >= 1 && b >= 1) {
            if (a % b != 0) {
                System.out.println(a / b + " " + a % b);
            } else {
                System.out.println("Divisible");
            }
        }
    }
}
