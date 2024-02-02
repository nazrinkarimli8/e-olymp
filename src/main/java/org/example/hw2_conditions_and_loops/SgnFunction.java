package org.example.hw2_conditions_and_loops;

import java.util.Scanner;

public class SgnFunction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextInt();
        if (x > 0) {
            System.out.println("1");
        } else if (x == 0) {
            System.out.println("0");
        } else if (x < 0) {
            System.out.println("-1");
        }
    }

    public static class MultiplicatinOfNumbers {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            if (n >= 100 && n < 1000) {
                //  n%10
                //  (n/10)%10
                //  n/100
                System.out.println((n / 100) * ((n / 10) % 10) * (n % 10));
            }
        }
    }
}
