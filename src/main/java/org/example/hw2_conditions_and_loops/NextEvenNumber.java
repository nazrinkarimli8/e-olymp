package org.example.hw2_conditions_and_loops;

import java.util.Scanner;

public class NextEvenNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n % 2 == 0) {
            System.out.println(n + 2);
        } else {
            System.out.println(n + 1);
        }
    }
}
