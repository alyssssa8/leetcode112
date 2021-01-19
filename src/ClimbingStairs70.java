public class ClimbingStairs70 {

    public static void main(String[] args) {
        climbStairs(7);
    }

    public static int climbStairs(int n) {
        if (n == 0|| n == 1||n == 2){
            return n;
        }
        int[] mem = new int[n];
        mem[0] = 1;
        mem[1] = 2;
        for (int i = 2; i < n; i++){
            mem[i] = mem[i-1] + mem[i-2];
            System.out.println(mem[i]);
        }
        return mem[n-1];
    }

}
