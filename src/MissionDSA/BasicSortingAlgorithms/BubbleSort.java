//Bubble Sort : Large elements come to the end of array by swapping with adjacent elements.

package MissionDSA.BasicSortingAlgorithms;
public class BubbleSort {

    public static void bubbleSort(int arr[]){
        //outer loop for number of turns.
        for(int turns =0;turns < arr.length-1; turns++){

            //inner loop for swapping values.
            for (int j = 0; j<arr.length-1-turns; j++){
                if(arr[j] > arr[j+1]){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
                }
            }
        }
    }
    //funtion for printing array
    public static void printArray(int arr[]){
        for(int a = 0; a<arr.length; a++){
            System.out.print(arr[a]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {4,5,2,1,3};
        bubbleSort(arr);
        printArray(arr);
    }
}
