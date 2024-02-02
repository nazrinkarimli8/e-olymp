package org.example.hw3_arrays;

import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long max = 0;
        long min = 0;
        if (a > 0 && b > 0) {
            if (a > b) {
                max = a;
                min = b;
                System.out.println(min + " " + max);
            } else if (b > a) {
                max = b;
                min = a;
                System.out.println(min + " " + max);
            }
        }
    }
}
