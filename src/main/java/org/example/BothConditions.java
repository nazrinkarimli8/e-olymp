package org.example;

import java.util.Scanner;

public class BothConditions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n % 3 == 0 && (n % 2 == 0 && n > 9 && n < 100)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}