package com.ayush;

public class lectureTopics {

    // TOPIC - ARRAY REFERENCE

    static void printarray(int[] arr){
        for (int i =0; i<arr.length; i++){
            System.out.print(arr[i] +" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0] = 5; arr[1] = 6; arr[2] = 7; arr[3] = 8; arr[4] = 9;
        System.out.println("Values of arr :");
        printarray(arr);

        System.out.println("Values of arr_2 :");
        //copying array values of arr in arr_2.
        int[] arr_2 = arr; //.clone();  // we can also use :- Arrays.copyOf(arrayName(arr) , array lenth(arr.lenth);
        printarray(arr);

        //Changing values of arr[0] and arr[1]
        arr_2[0] = 0;
        arr_2[1] = 0;

        System.out.println("After changing value of arr_2 , arr is :");
        printarray(arr);

        System.out.println("After changing value of arr_2, arr_2 is :");
        printarray(arr_2);

        //THE ELEMENTS OF arr ALSO CHANGES WHEN WE CHANGE THE VALUE OF ARRAY ELEMENTS WITH arr_2.
        //THIS HAPPENS BEACUSE arr AND arr_2 ARE HAVING THE SAME ADDRESS IN THE HEAP.
        // THIS CALLED - SHALLOW COPY.

        //FOR PREVENTING THIS, WE USE .clone(); FUNCTIOIN WHILE COPYING VALUES IN arr_2 (LINE 21).
        //WHEN WE USE .clone(); WE GOT A NEW MEMORY LOCATION IN THE HEAP WITH THE SAME DATA AND NEW ADDRESS ALSO.
        //arr_2 WILL GET THE NEW ADDRESS AND WILL ACCESS THE VALUES WIH NEW MEMORY LOCATION & arr WILL REMAIN SAME.
        //THIS CALLED - DEEP COPY

        // COPY OF RANGE METHOD - TO PRINT THE SPECIFIC RANGE OF AN ARRAY;
        // int[] arr_2 = arr.copyOfRange(1, 4);    o/p = 6 7 8

    }

}
