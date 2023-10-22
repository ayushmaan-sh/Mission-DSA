package MissionDSA.Arrays;

public class PairsInArray {

    //Function for making Pairs.
    public static void Pairs(int arr[]){
        //loop for first sticked value.
        for (int i=0; i<arr.length; i++){

            //loop for value that gonna print with sticked element.
            for (int j=i+1; j<arr.length; j++){
                System.out.print("("+arr[i]+","+arr[j]+")");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int arr[]= {2,4,6,8,10};
        Pairs(arr);
    }
}
