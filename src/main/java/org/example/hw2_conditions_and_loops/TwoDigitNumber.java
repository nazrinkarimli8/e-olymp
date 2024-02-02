package org.example.hw2_conditions_and_loops;

import java.util.Scanner;

public class TwoDigitNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if ((n > -100 && n < -9) || (n > 9 && n < 100)) {
            System.out.println("Ok");
        } else {
            System.out.println("No");
        }
    }
}
