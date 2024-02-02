package org.example.hw3_arrays;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a = 1;
        if (n >= 1 && m > 0 && m <= 100) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    System.out.print(a++ + " ");
                }
                System.out.println();
            }

        }
    }
}
