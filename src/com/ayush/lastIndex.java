package com.ayush;
import java.util.*;

public class lastIndex {
    Scanner sc = new Scanner(System.in);
    void lastOccur(){
        System.out.println("Enter size of the Array : ");        //Taking input of size of the array.
        int n = sc.nextInt();
        int []arr = new int[n];

        System.out.println("Enter Elements : ");                  //Taking input of elements of the array.
        for (int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the number you want to know the last occur of :-");
        int x = sc.nextInt();                                      //Input of that particular element.

        int lastOccur = -1;

        for (int i=0; i<arr.length; i++){
            if(arr[i]==x){
                lastOccur = i;
            }
        }
        System.out.println("Last occurence of "+x+" is at "+lastOccur+"th index");
    }

    public static void main(String[] args) {
        lastIndex obj = new lastIndex();
        obj.lastOccur();
    }
}
