package org.example.pre_module00_exam_mixed;

import java.util.Scanner;

public class ValueOfVariable5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float x = sc.nextFloat();
        double y = ((2 * x) / Math.sqrt(x * x + 1)) - (Math.sqrt(x * x + 1) / (x * x * x));
        if (x != 0) {
            System.out.printf("%.3f", y);
        }
    }
}
