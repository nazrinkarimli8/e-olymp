package org.example.pre_module00_exam_mixed;

import java.util.Scanner;

public class Rectangularr3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        if (n > 0 && n <= 100 && m > 0 && m <= 100){
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    System.out.print("#");
                }
                System.out.println();
            }
        }
    }
}
