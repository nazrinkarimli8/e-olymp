package org.example;

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
}
