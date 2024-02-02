package org.example.hw2_conditions_and_loops;

import java.util.Scanner;

public class BuildingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // building number:
        int n = sc.nextInt();
        int m = sc.nextInt();
        if (n >= 1 && m <= 100) {
            if ((n % 2 == 0 && m % 2 == 0) || (n % 2 != 0 && m % 2 != 0)) {
                System.out.println("1");  // the buildings are on the same side
            } else {
                System.out.println("0");  // the buildings are on different side
            }
        }
    }
}
