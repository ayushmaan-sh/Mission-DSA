package MissionDSA.BasicSortingAlgorithms;

public class InsertionSort {

    public static void insertSort(int arr[]){
    for(int i = 0; i < arr.length; i++){
        int curr = arr[i];
        int prv = i-1;
        //finding out correct position to insert.
        while(prv >= 0 && arr[prv] > curr){
            arr[prv +1 ] = arr[prv];
            prv--;
        }
        //insertion
        arr[prv+1] = curr;
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
        int arr[] = {5,4,2,1,3};
        insertSort(arr);
        printArray(arr);
    }
}
