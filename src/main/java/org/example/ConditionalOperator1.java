package org.example;

import java.util.Scanner;

public class ConditionalOperator1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if (x >= -1000 && x <= 1000) {

            if (x < 5) {
                System.out.println(x * x - 3 * x + 4);
            } else if (x >= 5) {
                System.out.println(x + 7);
            }
        }
    }
}
