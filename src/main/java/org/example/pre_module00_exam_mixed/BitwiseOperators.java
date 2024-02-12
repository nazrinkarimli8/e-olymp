package org.example.pre_module00_exam_mixed;

import java.util.Scanner;

public class BitwiseOperators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        long result = (1 << n) + (1 << k);
        System.out.println(result);
    }
}
