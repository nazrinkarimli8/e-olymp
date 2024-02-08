package org.example.pre_module00_exam_mixed;

import java.util.Scanner;

public class SimpleFunction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float x = sc.nextFloat();
        double f = x + Math.sin(x);
        System.out.printf("%.4f", f);
    }
}
