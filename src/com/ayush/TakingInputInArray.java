package com.ayush;
import java.util.*;

public class TakingInputInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Size of the Array : ");
        int n = sc.nextInt();
        int[]arraysize = new int[n];

        System.out.println("Enter Elements : ");
        for (int i=0;i<arraysize.length;i++){
            arraysize[i] = sc.nextInt();
        }

        for (int i=0; i<n; i++){
            System.out.print(arraysize[i] + " ");
        }
    }
}
