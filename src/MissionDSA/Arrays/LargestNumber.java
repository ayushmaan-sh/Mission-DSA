//Find out Largest Element in the array

package MissionDSA.Arrays;

public class LargestNumber {
    //function for finding out largest element.
    public static int largestValue(int arr[]){
    int largest = Integer.MIN_VALUE;    //-Infinity value (in java).

    for(int i=0; i<arr.length; i++){
        if(largest<arr[i]){
            largest=arr[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        int arr[] = {1,4,3,5,6,3,5};
        System.out.println("Largest Value : "+largestValue(arr));

    }
}
