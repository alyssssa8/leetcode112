public class maxSubArray {
    public static void main(){

        int [] nums = {-2,1,-3,4,-1,2,1,-5,4};
    }

    public static int maxSubArray(int[] nums){

        int currSum = nums[0];
        int maxSum = nums[0];
        for (int i = 0; i < nums.length; i++){
            currSum = Math.max(nums[i], currSum + nums[i]);
            maxSum = Math.max(maxSum, currSum);
        }
        return maxSum;
    }
}
