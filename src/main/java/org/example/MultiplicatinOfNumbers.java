package org.example;

import java.util.Scanner;

public class MultiplicatinOfNumbers {
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
