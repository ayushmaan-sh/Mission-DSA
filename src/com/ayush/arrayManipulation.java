package com.ayush;

public class arrayManipulation {

    void manipulate(){
        int [] array_1 = {3,2,1,4,1,2,3};

        for(int i=0; i<array_1.length; i++){
            for (int j=i+1; j<array_1.length; j++){  //j will travel in the whole array .
                    if(array_1[i]==array_1[j]){      //and if j found value equal to the i, it will make it -1.
                        array_1[i] = -1;
                        array_1[j] = -1;
                }
            }
        }
        //loop for identifying that unique value
        int x = -1;
        for (int i = 0; i<array_1.length; i++){
            if(array_1[i]>0) {
                x = array_1[i];
            }
        }
        System.out.println(x+" is unique");
    }

    public static void main(String[] args) {
        arrayManipulation obj = new arrayManipulation();
        obj.manipulate();
    }
}
