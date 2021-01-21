public class RemoveDuplicatesFromSortedArray26 {
    public static void main(String[] args) {
        int[] nums ={0,0,1,1,1,2,2,3,3,4};
        removeDuplicates(nums);

    }

    public static int removeDuplicates(int[] nums) {
        int result = 0;
        for(int i =1; i < nums.length; i++){
            if (nums[result] !=nums[i]){
                result++;
                nums[result]=nums[i];
            }
        }
        return result;
    }
}
