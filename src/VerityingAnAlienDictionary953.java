import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class VerityingAnAlienDictionary953 {

    private static int[] mapping = new int[26];
    public static void main(String[] args) {

        String[] words = {"hello","leetcode"};
        String order = "hlabcdefgijkmnopqrstuvwxyz";
        System.out.println(isAlienSorted(words, order));

    }

    public static boolean isAlienSorted(String[] words, String order) {

        for (int i = 0; i < order.length(); i++) {
            mapping[order.charAt(i) - 'a'] = i;
        }
        for (int i = 1; i < words.length; i++)
            if (bigger(words[i - 1], words[i])) { // if the front bigger that the second then return false'
                return false;
            }
        return true;
    }

    public static boolean bigger(String s1, String s2) {
        int n = s1.length(), m = s2.length();
        for (int i = 0; i < n && i < m; ++i)
            if (s1.charAt(i) != s2.charAt(i)) {
                return mapping[s1.charAt(i) - 'a'] > mapping[s2.charAt(i) - 'a'];
            }
        return n > m;
    }

//
//        Map<Character,Integer> myMap = new HashMap<Character,Integer>();
//        for (int i = 0; i <order.length(); i++){
//            myMap.put(order.charAt(i), i);
//        }
//
//        for(int i = 0; i < words.length; i++){
//            for(int j = 1; j<words[i].length();j++){
//                    if (words[i].charAt(j) < words[i].charAt(j  -  1) ){
//                        return false;
//                    }
//            }
//        }
//
//        return true;
//    }

}

//class Solution {
//    Map<Character, Integer> map;
//    public boolean isAlienSorted(String[] words, String order) {
//        map = new HashMap<>();
//        for (int i = 0; i < order.length(); i++) {
//            map.put(order.charAt(i), i);
//        }
//        for (int i = 0; i < words.length - 1; i++) {
//            if (!compare(words[i], words[i + 1])) return false;
//        }
//        return true;
//    }
//
//    private boolean compare(String s1, String s2) {
//        int l1 = s1.length(), l2 = s2.length();
//        for (int i = 0, j = 0; i < l1 && j < l2; i++, j++) {
//            if (s1.charAt(i) != s2.charAt(j)) {
//                if (map.get(s1.charAt(i)) > map.get(s2.charAt(j))) {
//                    return false;
//                } else {
//                    return true;
//                }
//            }
//        }
//        if (l1 > l2) return false;
//        return true;
//    }
//}
