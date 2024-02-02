package org.example.hw2_conditions_and_loops;

import java.util.Scanner;

public class SingleDigitNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n > -10 && n < 10){
            System.out.println("Ok");
        } else{
            System.out.println("No");
        }
    }
}
