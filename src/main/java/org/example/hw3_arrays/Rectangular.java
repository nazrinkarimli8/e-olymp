package org.example.hw3_arrays;

import java.util.Scanner;

public class Rectangular {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n > 0 && n <= 100) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print("#");
                }
                System.out.println();
            }
        }
    }
}
