package org.example.pre_module00_exam_mixed;

import java.util.Scanner;

public class MonthAndQuarter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n > 0 && n < 4) {
            System.out.println("First");
        } else if (n >= 4 && n < 7) {
            System.out.println("Second");
        } else if (n >= 7 && n < 10) {
            System.out.println("Third");
        } else if (n >= 10 && n <= 12) {
            System.out.println("Fourth");
        }
    }
}
