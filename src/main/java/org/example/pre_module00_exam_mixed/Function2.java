package org.example.pre_module00_exam_mixed;

import java.util.Scanner;

public class Function2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            float x= sc.nextFloat();
            double f = Math.sqrt(x) + (2 * x) + Math.sin(x);
            System.out.printf("\n%.4f", f);
        }
    }
}
