package org.example;

import java.util.Scanner;

public class FirstOrLast {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n >= 100 && n < 1000) {
            int first = n / 100;
            int last = n % 10;
            if (first > last) {
                System.out.println(first);
            } else if (last > first) {
                System.out.println(last);
            } else {
                System.out.println("=");
            }
        }
    }
}
