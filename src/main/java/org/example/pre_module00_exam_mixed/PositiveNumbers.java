package org.example.pre_module00_exam_mixed;

import java.util.Scanner;

public class PositiveNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        float arr[] = new float[n];
        float sum = 0;
        int positiveCount = 0;
        if (n > 0 && n <= 100) {
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextFloat();
            }

            for (int i = 0; i < n; i++) {
                if (arr[i] > 0) {
                    sum += arr[i];
                    positiveCount++;
                }
            }
            if (positiveCount > 0) {
                System.out.printf("%.2f", (sum / positiveCount));
            } else {
                System.out.println("Not Found");
            }
        }
    }
}
