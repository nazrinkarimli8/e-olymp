package org.example.pre_module00_exam_mixed;

import java.util.Scanner;

public class WhichTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a <= 100 && b <= 100 && c <= 100) {
            if (a == b && a == c) {
                System.out.println("1");
            } else if (a != b && a != c && b != c) {
                System.out.println("3");
            } else {
                System.out.println("2");
            }
        }
    }
}
