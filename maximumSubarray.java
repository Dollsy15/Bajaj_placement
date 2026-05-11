public class maximumSubarray {
    public static void main(String[] args) {
        maximumSubarray solver = new maximumSubarray();
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int result = solver.maxSubArray(nums);
        System.out.println("Maximum Subarray Sum: " + result);
    }

    public int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int currSum = nums[0];
        for(int i = 1; i < nums.length; i++){
            currSum = Math.max(nums[i], currSum + nums[i]);
            maxSum = Math.max(maxSum, currSum);
        }
        return maxSum;
    }
}
