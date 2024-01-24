package org.example;

import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextInt();
        long b = sc.nextInt();
        if (a >= 1 & b <= 1000000000) {
            if (a % b != 0) {
                System.out.println(a / b + " " + a % b);
            } else {
                System.out.println("Divisible");
            }
        }
    }
}
