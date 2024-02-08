package org.example.pre_module00_exam_mixed;

import java.util.Scanner;

public class ValueOfVariable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float x = sc.nextFloat();
        if (x != 0) {
            double y = Math.pow(x, 3) - (5 * x * x / 7) + (9 * x) - (3 / x) + 1;
            System.out.printf("%.3f", y);
        }
    }
}
