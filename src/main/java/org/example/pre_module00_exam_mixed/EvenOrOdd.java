package org.example.pre_module00_exam_mixed;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n >= 1) {
            if (n % 2 == 0) {
                System.out.println("EVEN");
            } else if (n % 2 != 0) {
                System.out.println("ODD");
            }
        }
    }
}
