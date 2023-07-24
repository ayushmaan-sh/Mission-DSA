package com.ayush;
import java.util.*;

public class revision {
  void arraymanipulation() {
      Scanner sc = new Scanner(System.in);

      System.out.print("Enter Array Size : ");
      int n = sc.nextInt();
      int arr[] = new int[n];

      System.out.print("Enter Array values : ");
      for (int i = 0; i < arr.length; i++) {
          arr[i] = sc.nextInt();
      }
      System.out.println("Enter K : ");
      int k = sc.nextInt();
        Arrays.sort(arr);
        for (int i=0; i<arr.length; i++){
            System.out.println("Array sorted : "+arr[i]);
        }

      System.out.println("the Kth smallest element in the given array : "+arr[k-1]);
  }

    public static void main(String[] args) {
        revision obj = new revision();
        obj.arraymanipulation();
    }
}
