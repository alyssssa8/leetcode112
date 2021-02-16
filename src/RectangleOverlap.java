public interface RectangleOverlap {
    public static void main(String[] args) {
        int[] rec1 = {0, 0, 2, 2};
        int[] rec2 = {1, 1, 3, 3};
        isRectangleOverlap(rec1, rec2);
    }

    public static boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        if (Math.max(rec1[0], rec2[0]) >= Math.min(rec1[2], rec2[2])) {
            return false;
        }
        if (Math.max(rec1[1], rec2[1]) < Math.min(rec1[3], rec2[3])) {
            return true;
        }
        return false;
    }
// ****************does not work
    public static boolean isRectangleOverlap2(int[] rec1, int[] rec2) {
        return rec1[0] < rec2[2] && rec2[0] < rec1[2] && rec1[1] < rec2[3] && rec2[1] < rec1[3];
    }
//    https://leetcode.com/problems/rectangle-overlap/discuss/133175/C%2B%2B-Solution-with-easy-explanation

}
