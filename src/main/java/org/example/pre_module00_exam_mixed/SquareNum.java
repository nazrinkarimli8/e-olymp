package org.example.pre_module00_exam_mixed;

import java.util.Scanner;

public class SquareNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        if (n > 0) {
            for (int i = 1; i <= Math.sqrt(n) ; i++) {
                    System.out.print(i * i + " ");
            }
        }
    }
}
