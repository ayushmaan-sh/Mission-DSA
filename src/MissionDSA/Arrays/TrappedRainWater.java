package MissionDSA.Arrays;

public class TrappedRainWater {
    public static int rainWater(int height[], int n){
        //calculate left maximum boundary
        int leftMax[] = new int[n];

        leftMax[0] = height[0]; //There's nothing before index 0
        for(int i=1; i<n; i++){
            //Comparing current bar height with previous bar height
            leftMax[i] = Math.max(height[i],leftMax[i-1]);
        }

        //calculate right maximum boundary
        int rightMax[] = new int[n];

        rightMax[n-1] = height[n-1];
        for(int i=n-2; i>=0; i--){
            rightMax[i] = Math.max(height[i], rightMax[i+1]);
        }

        int trappedWater = 0;
        //loop for calculating waterlevel and trapped water.
        for(int i=0; i<n; i++){
            //waterLevel -> Minimum of leftMax and rightMax
            int waterLevel = Math.min(leftMax[i],rightMax[i]);

            //Calculating trappedWater
            trappedWater += waterLevel - height[i];
        }
        return trappedWater;
    }
    public static void main(String[] args) {
        int height[] = {4,2,0,6,3,2,5};
        int n = height.length;

        System.out.println("Trapped Water : "+rainWater(height,n)+" units");
    }
}
