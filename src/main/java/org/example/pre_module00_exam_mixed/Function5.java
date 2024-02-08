package org.example.pre_module00_exam_mixed;

import java.util.Scanner;

public class Function5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextInt();
        long y = sc.nextInt();
        long z = sc.nextInt();
        if (x <= Math.pow(10, 6) && y <= Math.pow(10, 6) && z <= Math.pow(10, 6) && x > 0 && y > 0 && z > 0) {
            long f = (x * y * z) + x + (y * y) + (z * z * z);
            System.out.print(f);
        }
    }
}
