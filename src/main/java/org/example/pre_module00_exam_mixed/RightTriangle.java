package org.example.pre_module00_exam_mixed;

import java.util.Scanner;

public class RightTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextInt();
        long b = sc.nextInt();
        long c = sc.nextInt();
        if (a * a == b * b + c * c || b * b == a * a + c * c || c * c == a * a + b * b) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}