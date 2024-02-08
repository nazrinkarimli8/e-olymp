package org.example.pre_module00_exam_mixed;

import java.util.Scanner;

public class ValueOfVariable2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float x = sc.nextFloat();
        double y = x - ((x * x + 4) / 2) + (x * x * x) - (3 / (x + 7));
        if (x != -7) {
            System.out.printf("%.3f", y);
        }
    }
}
