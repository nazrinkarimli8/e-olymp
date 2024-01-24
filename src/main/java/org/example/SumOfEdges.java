package org.example;

import java.util.Scanner;

public class SumOfEdges {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n >= 1000 && n < 10000) {
            //  n/1000
            //  n%10
            System.out.println((n / 1000) + (n % 10));
        }
    }
}
