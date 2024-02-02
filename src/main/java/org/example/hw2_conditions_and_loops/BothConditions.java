package org.example.hw2_conditions_and_loops;

import java.util.Scanner;

public class BothConditions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();
        if ((n % 3 == 0) && (n % 2 == 0) && ((n > 9 && n < 100) || (n > -100 && n < -9))) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}