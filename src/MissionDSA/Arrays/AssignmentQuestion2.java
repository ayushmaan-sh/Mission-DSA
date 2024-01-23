package MissionDSA.Arrays;

public class AssignmentQuestion2 {
    public static void threeSum(int[] nums) {
        int n = nums.length;

        // Fix one element and use two pointers to find the other two elements
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        System.out.println(nums[i] + " " + nums[j] + " " + nums[k]);
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        threeSum(nums);
    }
}
