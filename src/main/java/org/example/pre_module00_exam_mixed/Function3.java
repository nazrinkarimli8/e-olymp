package org.example.pre_module00_exam_mixed;

import java.util.Scanner;

public class Function3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            float x = sc.nextFloat();
            float y = sc.nextFloat();
            double f = x * x + Math.sin(x * y) - y * y;
            System.out.printf("\n%.4f", f);
        }
    }
}
