package org.example;

import java.util.Scanner;
public class SimpleTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n >= 10 && n <= 99) {
            System.out.println(n / 10 + " " + n % 10);
        }
    }
}
