public class Static {
    // static
    static int a = 10;
    static int b;

    // static block
    static {
        System.out.println("Static block initialized.");
        System.out.println("1 " + a);
        System.out.println("2 " + b);
        b = a * 4;
    }
    public static void main(String[] args) {
        int[] nums ={0,0,1,1,1,2,2,3,3,4};

        System.out.println("a1: "+a);
        a +=10;
        System.out.println("a2: "+a);
        System.out.println(b);
        removeDuplicates(nums);
//        static must have static value.
//        removeDuplicates2(nums);
    }

    public static int removeDuplicates(int[] nums) {

        System.out.println("3 " + a);
        System.out.println("4 " + b);

        int result = 0;
        for(int i =1; i < nums.length; i++){
            if (nums[result] !=nums[i]){
                result++;
                nums[result]=nums[i];
            }
        }
        return result;
    }

    public int removeDuplicates2(int[] nums) {
        int result = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[result] != nums[i]) {
                result++;
                nums[result] = nums[i];
            }
        }
        return result;
    }

}
