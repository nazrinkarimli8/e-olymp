package org.example.pre_module00_exam_mixed;

import java.util.Scanner;

public class WhichQuarter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float x = sc.nextFloat();
        float y = sc.nextFloat();
        if (x > 0 && y > 0) {
            System.out.println("1");
        } else if (x < 0 && y > 0) {
            System.out.println("2");
        } else if (x < 0 && y < 0) {
            System.out.println("3");
        } else if (x > 0 && y < 0) {
            System.out.println("4");
        } else {
            System.out.println("0");
        }
    }
}