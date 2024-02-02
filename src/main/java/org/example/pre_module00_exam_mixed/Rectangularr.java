package org.example.pre_module00_exam_mixed;

import java.util.Scanner;

public class Rectangularr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (number > 0 && number <= 100) {
            for (int i = 0; i < number; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print("#");
                }
                System.out.println();
            }
        }
    }
}
