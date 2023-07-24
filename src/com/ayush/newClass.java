package com.ayush;

public class newClass {
    void myArray() {
        int[][] arr = {{24, 25}, {34, 35}};  //2D Array initialised
        for(int i=0; i< arr.length; i++){
            for(int j=0; j< arr[i].length; j++)//loop for accessing array element.
            System.out.println(arr[i][j]);
            System.out.println("length : "+arr.length);
        }
    }

    public static void main(String[] args) {
        newClass arr_abj = new newClass();
        arr_abj.myArray();                      //function called.
    }
}