package org.example;

import java.util.Scanner;

public class WaterAndIce {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextInt();
        if (t > -1000000000 && t < 1000000000) {
            if (t > 0) {
                System.out.println("Water");
            } else if (t <= 0) {
                System.out.println("Ice");
            }
        }
    }
}
