import java.util.ArrayList;
import java.util.List;

public class FindAllNumbersDisappearedInAnArray448 {
    public static void main(String[] args) {
        int[] nums={4,3,2,7,8,2,3,1};
        findDisappearedNumbers(nums);

    }


    public static List<Integer> findDisappearedNumbers(int[] nums) {
        int m = 0;
        for (int i = 0; i < nums.length; i++){
            m = Math.abs(nums[i]) - 1;
            if(nums[m] >0){
                nums[m] =-nums[m];
            }
        }
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < nums.length;i++){
            if (nums[i]>0){
                res.add(i+1);
            }
        }
        return res;
    }
}
