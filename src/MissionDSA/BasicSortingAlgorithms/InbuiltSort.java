package MissionDSA.BasicSortingAlgorithms;
//In this, we already have a in built function in a java package
import java.util.Arrays;
public class InbuiltSort {

    // Function for printing array
    public static void printArray(int arr[]){
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i]);
        }
        System.out.println();
    }
    public static void printArr2(int arr2[]){
        for (int i=0; i<arr2.length; i++){
            System.out.print(arr2[i]);
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {3,4,1,5,2};
        int arr2[] = {1,5,7,3,8,9,4,2,0,6};
        Arrays.sort(arr);

        //We can also sort according to specific indexes.
        Arrays.sort(arr2,0,5);
        printArray(arr);
        printArr2(arr2);
    }
}
