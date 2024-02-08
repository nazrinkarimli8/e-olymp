package org.example.pre_module00_exam_mixed;

import java.util.Scanner;

public class NegativeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        float arr[] = new float[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextFloat();
        }
        float sum = 0;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) {
                count++;
                sum += arr[i];
            }
        }
        System.out.printf(count + " " + "%.2f", sum);
    }
}