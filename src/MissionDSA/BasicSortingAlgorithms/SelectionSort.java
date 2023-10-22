package MissionDSA.BasicSortingAlgorithms;

// Methodology : Pick the smallest and put it in the beginning.

public class SelectionSort {
    public static void selectSort(int arr[]){
        //outer loop for turns.
        for (int i=0; i<arr.length-1; i++){
            int minPos = i;         //considering the first element as minimum position, compared later.

            for (int j=i+1; j<=arr.length-1; j++ ){
                if(arr[minPos] > arr[j]){       //comparing the minimum position with rest of the elements.
                    minPos = j;
                }
            }
            //swapping begins.
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
    }
    // Function for printing array
    public static void printArray(int arr[]){
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {3,5,4,2,1};
        selectSort(arr);
        printArray(arr);
    }
    }
