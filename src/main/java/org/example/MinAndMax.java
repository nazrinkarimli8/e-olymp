package org.example;

import java.util.Scanner;
public class MinAndMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int max = 0;
        int min = 0;
        if (a > b) {
            max = a;
            min = b;
        } else if (b > a) {
            max = b;
            min = a;
        }

        System.out.println(min + " " + max);
    }
}
