public class MoveZeroes281 {

    public static void main(String[] args) {
        int[] nums  ={0,1,0,3,12};
        moveZeroes(nums);


    }

    public static void moveZeroes(int[] nums) {
            int trav  = 0;
            for (int i = 0; i < nums.length; i++){
                if (nums[i]!=0){
                    nums[trav] = nums[i];
                    trav++;
                }
            }
            for (int i = trav; i < nums.length; i++){
                nums[i] = 0;283. Move Zeroes
            }

            for (int i  = 0; i < nums.length; i++){
                System.out.println(nums[i]);
            }

    }

}
