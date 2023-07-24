package com.ayush;

import java.util.Arrays;

public class checkSortedArray {

   static void sortedArray(int arr[]){
       arr = new int[]{1, 2, 4, 2, 5, 7, 4};
       Arrays.sort(arr);
       ;
        for (int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
            }
       System.out.print("Sorted Array : "+arr);
    }


    public static void main(String[] args) {
        int[] arr ={1,2,4,2,5,7,4};
        sortedArray(arr);

    }
}