package org.example;

import java.util.Scanner;

public class ConditionalOperator3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if (x >= -100 && x <= 100) {
            if (x < -4) {
                System.out.println(x + 5);
            } else if (x >= -4 && x <= 7) {
                System.out.println((x * x) - (3 * x));
            } else if (x > 7) {
                System.out.println((x * x * x) + (2 * x));
            }
        }
    }
}
