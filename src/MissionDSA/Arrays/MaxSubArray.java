package MissionDSA.Arrays;

public class MaxSubArray {

    public static void Sub_Array(int arr[]){
        int currsum = 0;
        int maxsum = Integer.MIN_VALUE;
        int start;
        int end;
        for (int i=0; i<arr.length; i++){
            start =i;
            for (int j=0; j<arr.length; j++){
                end = j;
                currsum =0;
                for (int k=start; k<=end; k++){
                    currsum += arr[k];
                }
                System.out.println(currsum);
                if(maxsum<currsum){
                    maxsum=currsum;
                }
            }
        }
        System.out.println("max sum : "+maxsum);
    }

    public static void main(String[] args) {
        int arr[]= {2,4,6,8,10};
        Sub_Array(arr);
    }
}
