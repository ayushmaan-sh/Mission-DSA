package com.ayush;
import java.util.*;

public class countTheOccurence {
    void countOccurence() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size : ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter "+n+" Elements :");
        for (int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter Element you want to count the occurence of :-");
        int x = sc.nextInt(); int count = 0;
        for (int i=0; i<arr.length; i++){
            if(arr[i] == x){
                count++;                //count is increasing everytime by 1 when arr[i] gets 5.
            }
        }
        System.out.println("No. of counts of "+x+": "+count);
    }

    public static void main(String[] args) {
    countTheOccurence obj = new countTheOccurence();
    obj.countOccurence();
    }

 }

