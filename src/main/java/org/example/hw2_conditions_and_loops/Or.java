package org.example.hw2_conditions_and_loops;

import java.util.Scanner;

public class Or {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n % 2 != 0 || (n > 0 && ((n > -1000 && n < -99) || (n > 99 && n < 1000)))) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
