package org.example.pre_module00_exam_mixed;

import java.util.Scanner;

public class FirstNonLargeElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        float arr[] = new float[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextFloat();
        }
        int count=0;
        for (int i = 0; i < n; i++) {
            if (arr[i] <= 2.5) {
                System.out.printf(i + 1 + " " + "%.2f", arr[i]);
                count++;
                break;
            }
        }
        if(count!=1){
            System.out.println("Not Found");
        }
    }
}