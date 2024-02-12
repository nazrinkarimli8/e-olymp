package org.example.pre_module00_exam_mixed;

import java.util.Scanner;

public class NumberInReverseOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();
        char arr[] = new char[num.length()];
        for (int i = 0; i < num.length(); i++) {
            arr[i] = num.charAt(i);
        }
        for (int i = num.length() - 1; i >= 0; i--) {
            System.out.print(arr[i]);
        }
    }
}
