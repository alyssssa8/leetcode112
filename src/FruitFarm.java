import java.util.HashMap;
import java.util.Map;

public class FruitFarm {
//      hackerrank
//    Complete the 'getMaxFruits' function below
//    The function is expected to return an INTEGER
//    The function accepts following parameters
//      1: CHARACTER_ARRAY fruits
//      2:INTEGER bucketSize
//     Optimal solution is expected

//    Give me a array of characters where each  character represent a
//    fruit tree, you are given two  baskets and your goal is to put
//    the maximum number of fruits in each basket. the only restrict is that
//    each basket can only have one type of fruits

    //    input: Fruits['A','B','C','A','C']
//    output:3
//    explanation: we can  put 2 'C' in one basket and one 'A'
//    in the other from the subarray['C','A','C']
    public static void main(String[] args) {

    }


    public static int getMaxFruits(char[] fruits, int bucketSize) {
        Map<Character, Integer> count = new HashMap<Character, Integer>();
        int res = 0, i = 0;
        for (int j = 0; j < fruits.length; ++j) {
            count.put(fruits[j], count.getOrDefault(fruits[j], 0) + 1);
            while (count.size() > 2) {
                count.put(fruits[i], count.get(fruits[i]) - 1);
                if (count.get(fruits[i]) == 0) count.remove(fruits[i]);
                i++;
            }
            res = Math.max(res, j - i + 1);
        }
        return res;
    }

    public static int getMaxFruits2(char[] fruits, int bucketSize) {

        return 0;
    }
}
