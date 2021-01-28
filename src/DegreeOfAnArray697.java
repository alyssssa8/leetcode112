import java.util.HashMap;
import java.util.Map;

public class DegreeOfAnArray697 {

    public static void main(String[] args) {

    }

    public static int findShortestSubArray(int[] A) {
        Map<Integer, Integer> count = new HashMap<>();
        Map<Integer, Integer> first = new HashMap<>();
        int res = 0;
        int degree = 0;
        for (int i = 0; i < A.length; i++) {
            first.putIfAbsent(A[i], i);
            count.put(A[i],count.getOrDefault(A[i],0) + 1);
            if (count.get(A[i]) > degree) {
                degree = count.get(A[i]);
                res = i - first.get(A[i]) + 1;
            }
            else if (count.get(A[i])== degree){
                res = Math.min(res, i - first.get(A[i]) + 1);
            }

        }
        return res;
    }
}
