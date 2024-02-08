package org.example.pre_module00_exam_mixed;

import java.util.Scanner;

public class Transformation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        while (n != 1) {
            if (n % 2 == 0) {
                n = n / 2;
                count++;
            } else if (n % 2 != 0) {
                n = n + 1;
                count++;
            }
        }
        System.out.println(count);
    }
}
