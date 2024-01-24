package org.example;

import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        if (a <= 1000 && b <= 1000 && c <= 1000 && d <= 1000) {
            int maxNumber=0;
            if (a >= b && a >= c && a >= d) {
                maxNumber = a;
            } if (b >= a && b >= c && b >= d) {
                maxNumber = b;
            }  if (c >= a && c >= b && c >= d) {
                maxNumber = c;
            } if (d >= a && d >= b && d >= c) {
                maxNumber = d;
            }
            System.out.println(maxNumber);
        }

    }
}
