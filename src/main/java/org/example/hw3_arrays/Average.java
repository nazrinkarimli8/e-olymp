package org.example.hw3_arrays;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if ((a > b && a < c) || (a < b && a > c)) {
            System.out.println(a);
        } else if ((b > a && b < c) || (b < a && b > c)) {
            System.out.println(b);
        } else if ((c > a && c < b) || (c < a && c > b)) {
            System.out.println(c);
        }
    }
}
//    Scanner sc = new Scanner(System.in);
//    int n = sc.nextInt();
//    int arr[] = new int[n];
//        for (int i = 0; i < n; i++) {
//        arr[i] = sc.nextInt();
//        }
//        for (int i = 0; i < n; i++) {
//        System.out.print(arr[i] + " ");
//        }
//        System.out.println();
//        int sum = 0;
//        int prod = 1;
//        int min=arr[0];
//        int max=arr[0];
//        for (int i = 0; i < n; i++) {
//        sum += arr[i];
//        prod *= arr[i];
//        System.out.print(arr[i] * 2 + " ");