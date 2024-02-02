package org.example.hw2_conditions_and_loops;

import java.util.Scanner;

public class IntervalOut {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextInt();
        long a = sc.nextInt();
        long b = sc.nextInt();
        if (x < a || x > b) {
            System.out.println("OUT");
        } else {
            System.out.println("IN");
        }
    }
}
