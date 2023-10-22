package MissionDSA.Arrays;

import java.util.Scanner;

public class InputOutputUpdate {
    public static void main(String[] args) {
        int marks [] = new int[100];    //making array

        Scanner sc = new Scanner(System.in);
        marks[0] = 93;  //marks of financial accounting
        marks[1] = 98;  //marks of Computer automation using ms office.
        marks[2] = 72;  //marks of Business Economics.

        //Printing Array Elements.
        System.out.println("Financial Accounting : " + marks[0]);
        System.out.println("Computer automation using ms office : " + marks[1]);
        System.out.println("Business Economics : " + marks[2]);

        //updating element values
        marks[2] = 82;
        System.out.println("Business Economics : " + marks[2]);

        //another
        marks[2] = marks[2]+1;

        //know the length of array
        System.out.println(marks.length);

    }
}
