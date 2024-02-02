package org.example.pre_module00_exam_mixed;

import java.util.Scanner;
import java.lang.Math;

public class SquareOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (number > 0) {
            int m = (int) Math.sqrt(number);
            if (m * m == number) {
                System.out.println(m);
            } else {
                System.out.println("No");
            }
        }
    }
}
