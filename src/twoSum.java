import java.util.HashMap;
import java.util.Map;

public class twoSum {
    public static void main(String[] args) {
        int target = 18;
        int[] nums = {2,7,11,15};
        int [] result=twoSum(nums, target);
        System.out.println(result.length);
        for (int i = 0; i < 2; i++){
            //System.out.println(result[i]);
            System.out.println(i+"  kkk");
        }

    }


    public  static int[] twoSum(int[] nums, int target){
        int [] result = new int[2];
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        for (int i  = 0; i < nums.length;i++){
            if (map.containsKey(target - nums[i])){
                    result[1] = i;
                    result[0] = map.get(target - nums[i]);
                    System.out.println("1: " + result[0]+ " "+result[1]);

                    return result;
            }
            map.put(nums[i], i);  // key and value
        }
        System.out.println("2: " + result);
        return result;
    }

}
