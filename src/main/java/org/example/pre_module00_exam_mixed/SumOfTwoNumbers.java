package org.example.pre_module00_exam_mixed;

import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int arr[][] = new int[t][2];
        if (t >= 1 && t <= 100) {
            for (int i = 0; i < t; i++) {
                for (int j = 0; j < 2; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }
            for (int i = 0; i < t; i++) {
                System.out.println(arr[i][0] + arr[i][1]);
            }
        }
    }
}

