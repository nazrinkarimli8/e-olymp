package org.example.pre_module00_exam_mixed;

import java.util.Scanner;

public class SumOfElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        float sum=0;
        for(int i=0; i<n; i++){
            float num=sc.nextFloat();
            sum+=num;
        }
        System.out.printf("%.1f",sum);
    }
}