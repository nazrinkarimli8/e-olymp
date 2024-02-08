package org.example.pre_module00_exam_mixed;

import java.util.Scanner;

public class Function4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextInt();
        if (x <= Math.pow(10, 9)) {
            long f = 1 + x + (x * x);
            System.out.print(f);
        }
    }
}
