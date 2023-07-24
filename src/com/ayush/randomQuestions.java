package com.ayush;

import java.util.Scanner;

public class randomQuestions {

//  int repeatedValue() {
//      Scanner sc = new Scanner(System.in);
//      System.out.println("Enter array size : ");
//      int n = sc.nextInt();
//      int arr[] = new int[n];
//
//      System.out.println("Enter " + n + " Elements :");
//      for (int i = 0; i < arr.length; i++) {
//          arr[i] = sc.nextInt();
//      }
//
//      int count = 0;
//      for (int i = 0; i < arr.length; i++) {
//          for (int j = i + 1; j < arr.length; j++) {
//              if (arr[i] == arr[j]) {
//                  System.out.println(arr[i] + " and " + arr[j] + " are the first element that are same.");
//                  return arr[i];
//              }
    // we use return statement becuase it makes the whole method stop.
    // break; statement stop only one iteration.
//
//          }
//      }
//      return -1;

    void reverseArray() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size : ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.print("Enter " + n + " Elements :");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("enter o : ");
        int o = sc.nextInt();
        System.out.println("Reversed array o times : ");
        for(int m = 0; m<=o; m++) {
            for (int i = n - 1; i >= 0; i--) {
                System.out.print(" " + arr[i] + " ");

            }
        }

    }
    public static void main(String[] args) {
        randomQuestions obj = new randomQuestions();
//        obj.repeatedValue();
        obj.reverseArray();
    }
}
