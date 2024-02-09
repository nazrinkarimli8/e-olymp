package org.example.pre_module00_exam_mixed;

import java.util.Scanner;

public class SumAndCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        while (sc.hasNext()) {
            int n = sc.nextInt();
            sum += n;
            count++;
        }
        System.out.print(count + " " + sum);
    }
}