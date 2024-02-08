package org.example.pre_module00_exam_mixed;

import java.util.Scanner;

public class ValueOfVariable6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float x = sc.nextFloat();
        double y = Math.sqrt(Math.pow(x, 4) + 1) / (x * x) - Math.sqrt((x * x) / (x * x + 1));
        if (x != 0) {
            System.out.printf("%.3f", y);
        }
    }
}
