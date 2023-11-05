package MissionDSA.Recursion;
public class FirstOccurence {
    public static int keyOccurence(int arr[],int key, int n){
        if(n == arr.length){    //Base Case
            return -1;
        }
        if(arr[n] == key){      //Checking if element at n is equal to key
            return n;
        }
        return  keyOccurence(arr,key,n+1);
    }

    public static void main(String[] args) {
         int arr[] = {1,4,3,5,2,6,5,2,6};
        System.out.println(keyOccurence(arr,2,0));
    }
}
