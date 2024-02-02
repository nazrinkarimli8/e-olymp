package org.example.pre_module00_exam_mixed;
import java.util.Scanner;
public class ArrayPrint {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        if(n>0 && n<=100){
            for(int i=0; i<n; i++){
                arr[i]=sc.nextInt();
            }
            for(int i=0; i<n; i++){
                System.out.println(arr[i]);
            }
        }
    }
}