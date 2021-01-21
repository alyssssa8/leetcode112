import java.util.Arrays;

public class ValidAnagram242 {
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        isAnagram(s,t);
    }

    public static boolean isAnagram(String s, String t) {
        int[] alphabet = new int[26];
        for (int i = 0; i < s.length(); i++) {
            alphabet[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < t.length(); i++) {
            alphabet[t.charAt(i) - 'a']--;
        }
        for (int i : alphabet) {
            if (i != 0) {
                return false;
            }
        }
        return true;

//ravei


//        if (s.length()!= t.le242. Valid Anagramngth()){
//            return false;
//        }
//        char[] str1 = s.toCharArray();
//        char[] str2 = t.toCharArray();
//        Arrays.sort(str1);
//        Arrays.sort(str2);
//
//        return Arrays.equals(str1, str2);
    }
}

