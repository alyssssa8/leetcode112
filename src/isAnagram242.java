import java.util.Arrays;

public class isAnagram242 {

    public static void main(String[] args) {
        String word1 = "abcde";
        String word2 = "bcedfg";
        boolean result = isAnagram(word1, word2);
        System.out.println(result);

        isAnagram2("Keep", "Peek");
        isAnagram2("Mother In Law", "Hitler Woman");
    }

    public static boolean isAnagram(String word1, String word2){
        if (word1.length()!= word2.length()){
            return false;
        }
        char[] str1 = word1.toCharArray();
        char[] str2 = word2.toCharArray();
        Arrays.sort(str1);
        Arrays.sort(str2);

        return Arrays.equals(str1, str2);
    }

    public static void isAnagram2(String str1, String str2) {
//        remove whitespace
        String s1 = str1.replaceAll("\\s", ""); //replaces all occurrences of "a" to "b"
        String s2 = str2.replaceAll("\\s", "");  //single whitespace character
        boolean status = true;
        if (s1.length() != s2.length()) {
            status = false;
        } else {
            char[] ArrayS1 = s1.toLowerCase().toCharArray();
            char[] ArrayS2 = s2.toLowerCase().toCharArray();
            Arrays.sort(ArrayS1);
            Arrays.sort(ArrayS2);
            status = Arrays.equals(ArrayS1, ArrayS2);
        }
        if (status) {
            System.out.println(s1 + " and " + s2 + " are anagrams");
        } else {
            System.out.println(s1 + " and " + s2 + " are not anagrams");
        }
    }



}
