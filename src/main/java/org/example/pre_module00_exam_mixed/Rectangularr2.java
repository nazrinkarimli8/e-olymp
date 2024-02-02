package org.example.pre_module00_exam_mixed;

import java.util.Scanner;

public class Rectangularr2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (number > 0 && number <= 100) {
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < number; j++) {
                    System.out.print("#");
                }
                System.out.println();
            }
        }
    }
}
