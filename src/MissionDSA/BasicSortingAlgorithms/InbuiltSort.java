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
    public static void main(String[] args) {
        int arr[] = {3,4,1,5,2};
        Arrays.sort(arr);
        printArray(arr);
    }
}
