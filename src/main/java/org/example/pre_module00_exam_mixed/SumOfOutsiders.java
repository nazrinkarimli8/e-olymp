package org.example.pre_module00_exam_mixed;

import java.util.Scanner;

public class SumOfOutsiders {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int firstDigit = n / 1000;
        int lastDigit = n % 10;
        System.out.println(firstDigit + lastDigit);
    }
}