//Binary Search means, checking through dividing the array by taking a mid value.
//Suppose if we have num = {3,4,5,9,10,11,12}, and we have to find 11.
//Then we divide the array into two section i.e left and right and the mid value will be 9.
//Elements before or less then 9 will left section and elements after or greater then 9 will be right section.
//9 will be the mid value.
//prerequisite for binary array is that array should be sorted.

package MissionDSA.Arrays;

public class BinarySearch {

    public static int Binary_Search(int arr[], int key){
        int start = 0, end = arr.length-1;

        while(start<=end){
            int mid = (start+end)/2;    //identifying the mid value.

            if(arr[mid] == key){        //if they key itself matched with mid value.
                return  mid;
            }
            if(arr[mid] < key){         //if key is greater then mid value.
                start = mid+1;
            }
            else{                       //if key is less then mid value
                start = mid-1;
            }
        }
        return -1;      //if key doesn't matched in the last.
    }

    public static void main(String[] args) {
        int arr[] = {2,4,5,9,10,11,12};
        int key = 11;

        System.out.println("index for key is: "+ Binary_Search(arr,key));
    }
}
