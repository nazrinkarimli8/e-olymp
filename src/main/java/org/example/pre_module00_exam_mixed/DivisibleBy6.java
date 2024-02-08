package org.example.pre_module00_exam_mixed;

import java.util.Scanner;

public class DivisibleBy6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int count = 0;
        int sum = 0;
        if (n > 0 && n <= 100) {
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            for (int i = 0; i < n; i++) {
                if (arr[i] % 6 == 0 && arr[i] > 0) {
                    count++;
                    sum += arr[i];
                }
            }
            System.out.print(count + " " + sum);
        }
    }
}
