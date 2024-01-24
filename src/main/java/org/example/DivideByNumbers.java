package org.example;

import java.util.Scanner;

public class DivideByNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n >= 1000 && n < 10000) {
            int n1 = n / 1000;
            int n2 = (n / 100) % 10;
            int n3 = (n / 10) % 10;
            int n4 = n % 10;
            if (n % n1 == 0 && n % n2 == 0 && n % n3 == 0 && n % n4 == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
