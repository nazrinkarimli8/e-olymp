package org.example.hw2_conditions_and_loops;

import java.util.Scanner;

public class Seasons {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println((n >= 1 && n <= 2) ? "Winter" : ((n >= 3 && n <= 5) ? "Spring" :
                ((n >= 6 && n <= 8) ? "Summer" : ((n >= 9 && n <= 11) ? "Autumn" :
                        (n == 12 ? "Winter" : "Wrong number!")))));
    }
}
