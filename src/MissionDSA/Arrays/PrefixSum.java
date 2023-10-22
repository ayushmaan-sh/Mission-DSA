package MissionDSA.Arrays;

public class PrefixSum {

    public static void Prefix_sum(int arr[]){
        int start , end, prefix[] = new int[arr.length],currSum = 0, maxSum = Integer.MIN_VALUE;
        prefix[0] = arr[0];
        for(int i=0; i<prefix.length; i++) {
            prefix[i] = prefix[i-1] + arr[i];
        }
        for (int i=0;i<arr.length; i++){
            start = i;
            for (int j=0;j<arr.length; j++){
                end = j;
                currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start-1];

                if(maxSum < currSum){
                    maxSum = currSum;
                }
            }
        }
        System.out.println("max sum : "+maxSum);
    }

    public static void main(String[] args) {
        int arr[] = {1,-1,5,4,7};
        Prefix_sum(arr);
    }
}
