package org.example;

import java.util.Scanner;

public class IntervalIn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextInt();
        long a = sc.nextInt();
        long b = sc.nextInt();
        if (x >= a && x <= b) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
