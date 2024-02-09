package org.example.pre_module00_exam_mixed;

import java.util.Scanner;

public class DivisionOfSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long k = sc.nextLong();
        long sum = 0;
        for (int i = 1; ; i++) {
            sum += i;
            if (sum % k == 0) {
                System.out.println(i);
                break;
            }
        }
    }
}