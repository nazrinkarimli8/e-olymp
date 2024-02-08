package org.example.pre_module00_exam_mixed;

import java.util.Scanner;

public class ValueOfVariable3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float x = sc.nextFloat();
        double y = (x * x + 3 * x - 4) / (2 * x - 3) - (x + 2) / (x * x - 5 * x + 7);
        if (x != 1.5) {
            System.out.printf("%.3f", y);
        }
    }
}
