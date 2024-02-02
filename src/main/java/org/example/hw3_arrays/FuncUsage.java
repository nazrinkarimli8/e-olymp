package org.example.hw3_arrays;

import java.util.Scanner;
import java.lang.Math;

public class FuncUsage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Float x = sc.nextFloat();
        Float y = sc.nextFloat();
        Float z = sc.nextFloat();
        float result = Math.min(Math.max(x, y), Math.max(y, z));
        System.out.println(Math.min(result, x + y + z));
    }
}
